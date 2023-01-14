package Lec10;

import java.util.*;

public class Min_Value {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(minvalue(arr));
	}

	public static int minvalue(int[] arr) {
		int mini = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[mini]) {
				mini = i;
			}
		}
		return arr[mini];
	}
}