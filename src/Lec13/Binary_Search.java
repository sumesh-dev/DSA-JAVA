package Lec13;

public class Binary_Search {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 8, 9, 12, 14, 15, 16, 17 };
		int item = 11;
		System.out.println(Search(arr, item));
	}

	public static int Search(int[] arr, int item) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}