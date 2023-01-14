package Lec10;

import java.util.*;

public class Running_Sum_Hackerblocks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		running_sum(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	public static void running_sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			arr[i] = sum;
		}
	}
}