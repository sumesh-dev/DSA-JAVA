package Lec10;

import java.util.*;

public class Max_Array_Hackerblocks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(max(arr));
	}

	public static int max(int[] arr) {
		int k = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (k < arr[i]) {
				k = arr[i];
			}
		}
		return k;
	}
}