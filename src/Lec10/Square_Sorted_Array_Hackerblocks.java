package Lec10;

import java.util.*;

public class Square_Sorted_Array_Hackerblocks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		running_sum(arr);
		sort(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	public static void running_sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] * arr[i];
			arr[i] = sum;
		}
	}

	public static void sort(int[] a) {
		for (int j = 0; j < a.length; j++) {
			for (int i = j + 1; i < a.length; i++) {
				if (a[j] > a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
}