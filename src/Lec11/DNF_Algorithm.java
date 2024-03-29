package Lec11;

public class DNF_Algorithm {
	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		int i = 0; // 0 ka track
		int j = arr.length - 1; // 2 ka track
		int k = 0; // array transverse
		while (k <= j) {
			if (arr[k] == 2) {
				int temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
				j--;
			} else if (arr[k] == 0) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				i++;
				k++;
			} else {
				k++;
			}
		}
	}
}