package Lec14;

import java.util.*;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while (a-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(maximumsum(arr));
		}
	}

	public static int maximumsum(int[] arr) {
		int linearkadane = kadane(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			arr[i] = arr[i] * -1;
		}
		int invertedkadane = kadane(arr);
		int cirlkadane=invertedkadane+sum;
		return Math.max(linearkadane, cirlkadane);
	}

	public static int kadane(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int prevsum = 0;
		for (int i = 0; i < arr.length; i++) {
			prevsum += arr[i];
			ans = Math.max(ans, prevsum);
			if (prevsum < 0) {
				prevsum = 0;
			}
		}
		return ans;
	}
}
