package Lec10;

import java.util.*;

public class Rotate_Array_Reversal_Algo_Leetcode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		reversal_algorithm(arr, k);
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	public static void reversal_algorithm(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		// 1st n-k element reverse karna
		reverse(arr, 0, n - k - 1);
		// last k element reverse
		reverse(arr, n - k, n - 1);
		// all element reverse karna
		reverse(arr, 0, n - 1);
	}

	public static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}