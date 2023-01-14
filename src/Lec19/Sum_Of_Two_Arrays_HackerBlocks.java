package Lec19;

import java.util.ArrayList;

public class Sum_Of_Two_Arrays_HackerBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 0, 2, 9 };
		int[] arr1 = { 3, 4, 5, 6, 7 };
		SumOfTwoArrays(arr, arr1);

	}

	public static void SumOfTwoArrays(int[] arr, int[] arr1) {
		int carry = 0;
		int i = arr.length - 1;
		int j = arr1.length - 1;
		ArrayList<Integer> list = new ArrayList<>();
		while (i >= 0 || j >= 0) {
			int sum = 0;
			if (i >= 0) {
				sum += arr[i];
				i--;
			}
			if (j >= 0) {
				sum += arr1[j];
				j--;
			}
			sum += carry;
			list.add(sum % 10);
			carry = sum / 10;
		}
		if (carry > 0) {
			list.add(carry);
		}
		for (int k = list.size() - 1; k >= 0; k--) {
			System.out.print(list.get(k) + " ");
		}
	}

}
