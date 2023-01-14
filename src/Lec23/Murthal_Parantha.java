package Lec23;

import java.util.*;

public class Murthal_Parantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();// no. of parantha
		int noc = sc.nextInt();// no.of cooks
		int[] rating = new int[noc];
		for (int i = 0; i < rating.length; i++) {
			rating[i] = sc.nextInt();
		}
		Arrays.sort(rating);
		System.out.println(MinimumTime(rating, p, noc));
	}

	private static int MinimumTime(int[] rating, int p, int noc) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = (rating[rating.length - 1] * (p * (p + 1))) / 2;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isPossible(rating, mid, p)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	private static boolean isPossible(int[] rating, int mid, int p) {
		// TODO Auto-generated method stub
		int chef = 0;
		int parantha = 1;
		int sum = 0;// calculating total time for paratha
		int total_parattha = 0;
		while (chef < rating.length) {
			sum += rating[chef] * parantha;
			if (sum <= mid) {
				parantha++;
				total_parattha++;
			} else {
				parantha = 1;
				sum = 0;
				chef++;
			}
		}
		if (total_parattha >= p) {
			return true;
		} else {
			return false;
		}
	}

}
