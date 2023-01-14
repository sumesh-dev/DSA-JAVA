package Lec14;

import java.util.*;

public class Next_Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int b = 1; b <= a; b++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			permutate(arr);
			for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}

	public static void permutate(int[] arr) {
		int p = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		int q = 0;
		for (int i = arr.length-1; i >p; i--) {
			if(arr[i]>arr[p]) {
				q=i;
				break;
			}
		}
		if(q==0 && p ==0) {
			reverse(arr, 0, arr.length-1);
			return;
		}
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		reverse(arr,p+1,arr.length-1);
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