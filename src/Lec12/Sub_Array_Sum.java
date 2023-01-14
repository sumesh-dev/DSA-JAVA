package Lec12;

public class Sub_Array_Sum {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(subarraysum(arr));
	}

	public static int subarraysum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 1; j < arr.length; j++) {
				sum = sum + arr[j];
				ans = Math.max(ans, sum);
			}
		}
		return ans;
	}
}