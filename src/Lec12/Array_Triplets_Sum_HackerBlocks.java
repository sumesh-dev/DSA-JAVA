package Lec12;

import java.util.*;

public class Array_Triplets_Sum_HackerBlocks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		sort(arr);
		add(arr, sum);
	}

	public static void add(int[] arr, int ans) {
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int k = i + 1; k < arr.length; k++)
				for (int j = arr.length - 1; j > k; j--) {
					if (arr[i] + arr[j] + arr[k] == ans) {
						a = arr[i];
						b = arr[k];
						c = arr[j];
						System.out.println(a + ", " + b + " and " + c);
					}
				}
		}
		// System.out.print(a+" "+b+" "+c);
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}