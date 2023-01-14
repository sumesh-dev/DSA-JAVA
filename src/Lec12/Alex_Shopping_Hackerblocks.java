package Lec12;

import java.util.*;

public class Alex_Shopping_Hackerblocks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int j = 0;
		while (j < x) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			answer(arr, a, b);
			j++;
		}
	}

	public static void answer(int[] arr, int a, int b) {
		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			if(a%arr[x]==0) {
					sum++;
			}
		}
		if (sum >= b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}