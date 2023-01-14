package Lec11;

import java.util.*;

public class Inverse_Of_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		inverse(arr);
	}

	public static void inverse(int[] arr) {
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			arr2[x] = i;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr2[j] + " ");
		}
	}
}