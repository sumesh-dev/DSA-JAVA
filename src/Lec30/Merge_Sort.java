package Lec30;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 1, 4, 2 };
		int[] ans = sort(arr, 0, arr.length - 1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] sort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}
		int mid = (si + ei) / 2;
		int[] a = sort(arr, si, mid);
		int[] b = sort(arr, mid + 1, ei);
		return MergeTwoArray(a, b);
	}

	public static int[] MergeTwoArray(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] ans = new int[arr1.length + arr2.length];
		while (arr1.length > i && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				ans[k] = arr2[j];
				k++;
				j++;

			} else {
				ans[k] = arr1[i];
				k++;
				i++;
			}
		}
		while (i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}

}
