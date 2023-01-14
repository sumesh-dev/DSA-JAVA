package Lec18;

import java.util.*;

public class Sub_Array_Sum_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 14, 7, 11, 13, 18, 16 };
		int k = 3;
		System.out.println(SubArraySum(arr, k));
	}

	public static int SubArraySum(int[] arr, int k) {
		int sum = 0;
		// 1st Window Ke Liye
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];
			sum = sum - arr[i - k];
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
