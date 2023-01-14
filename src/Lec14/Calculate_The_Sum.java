package Lec14;

import java.util.*;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			int x = sc.nextInt();
			int[] bbr = new int[n];
			for (int i = 0; i < bbr.length; i++) {
				int j = i - x;
				if (j < 0) {
					j += n;
				}
				bbr[i] = arr[i] + arr[j];
			}
			arr = bbr;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		sum = sum % 1000000007;
		System.out.println(sum);
	}

}
