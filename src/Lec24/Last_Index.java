package Lec24;

import java.util.*;

public class Last_Index {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		count = n - 1;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = sc.nextInt();
		System.out.println(LastIndex(arr, ans, n - 1, -1));
	}

	public static int LastIndex(int[] arr, int Search, int n, int m) {
		if (m == n) {
			return -1;
		} else if (arr[n] == Search) {
			return count;
		}
		count--;
		return LastIndex(arr, Search, n - 1, m);
	}

}
