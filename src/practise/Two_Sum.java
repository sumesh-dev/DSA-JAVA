package practise;

import java.util.Arrays;
import java.util.Iterator;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 1, 3, 4, 2 };
		int target = 5;
		int[] arr = (twoSum(nums, target));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}
		}
		return arr;
	}
}
