package Lec32;

import java.util.*;

public class Randomized_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 3, 6, 8, 2, 1, 44, 78 };
		sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr, int si, int ei) {
		if (si > ei) {
			return;
		}
		int pi = partition(arr, si, ei);
		sort(arr, si, pi - 1);
		sort(arr, pi + 1, ei);
	}

	public static int partition(int[] arr, int si, int ei) {
		Random rn = new Random();
		int r = rn.nextInt(ei - si + 1) + si;
		int temp = arr[r];
		arr[r] = arr[ei];
		arr[ei] = temp;
		int item = arr[ei];
		int pi = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] < item) {
				int ii = arr[i];
				arr[i] = arr[pi];
				arr[pi] = ii;
				pi++;
			}
		}
		int ii = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = ii;
		return pi;
	}

}
