//This code will not work here because in leetcode isBadVersion was inbuilt function...
package Lec13;

public class First_Bad_Version_Leetcode {
	public static void main(String[] args) {
		int arr[]=new int[5];
		int low = 1;
		int high = arr.length - 1;
		int ans = 0;
		while (low <= high) {
			int mid = (high - low) / 2 + low;
			if (isBadVersion(mid) == true) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
//		return ans;
	}

	public static boolean isBadVersion(int v) {
		return false;
	}
}