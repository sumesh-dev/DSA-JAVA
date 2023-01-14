package Lec20;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows_HackerBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int stalls = sc.nextInt(); // number of stalls
		int cow = sc.nextInt();
		int[] stall = new int[stalls];
		for (int i = 0; i < stall.length; i++) {
			stall[i] = sc.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(largest_min_distance(stall, cow));
	}

	public static int largest_min_distance(int[] stall, int cows) {
		int lo = 0;
		int n = stall.length;
		int hi = stall[n - 1] - stall[0];
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(stall, cows, mid) == true) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] stall, int cows, int mid) {
		int cow = 1;
		int pos = stall[0];
		int i = 1;
		while (i < stall.length) {
			if (stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}
			if (cow == cows) {
				return true;
			}
			i++;
		}
		return false;
	}

}
