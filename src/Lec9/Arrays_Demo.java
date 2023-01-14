package Lec9;

public class Arrays_Demo {
	public static void main(String[] args) {
		int[] arr = new int[5]; // java type array
//		int arr [] = new int [5];  //c/c++ type array
		arr[0] = 7;
		arr[1] = 8;
		arr[2] = 9;
		arr[3] = 10;
		arr[4] = 11;
		// System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}