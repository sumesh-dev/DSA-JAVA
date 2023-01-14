package Lec11;

public class Bubble_Sort {
	public static void main(String[] args) {
		int[] arr = { 5, 3, -7, 4, 8, 2 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
			boolean sign = false;
			for (int i = 0; i < arr.length - turn; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sign = true;
				}
			}
			if (sign == false) {
				return;
			}
		}
	}
}