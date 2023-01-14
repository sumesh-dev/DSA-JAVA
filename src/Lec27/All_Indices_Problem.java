package Lec27;

import java.util.*;

public class All_Indices_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		Indices(arr, m, 0);
	}

	public static void Indices(int[] arr, int m, int i) {
		if (i == arr.length) {
			return;
		}
		if (arr[i] == m) {
			System.out.print(i + " ");
		}
		Indices(arr, m, i + 1);
	}

}
