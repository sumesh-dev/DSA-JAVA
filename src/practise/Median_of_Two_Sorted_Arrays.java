package practise;

import java.util.*;

public class Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = { 1, 3 };
		int[] num2 = { 2 };
		int num[] = new int[num1.length + num2.length];
		System.out.println(median(num, num1, num2));
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
	}

	public static double median(int[] num, int[] nums1, int[] nums2) {
		for (int i = 0; i < nums1.length; i++) {
			num[i] = nums1[i];
		}
		for (int j = 0; j < nums2.length; j++) {
			num[nums1.length + j] = nums2[j];
		}
		Arrays.sort(num);
		if (num.length % 2 != 0) {
			return num[num.length / 2];
		} else {
			double x = (((num[(num.length / 2) - 1]) + (num[num.length / 2])) / 2f);
			return x;
		}
	}
}
