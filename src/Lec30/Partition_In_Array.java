package Lec30;

public class Partition_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 3, 8, 9, 1, 4 };
		int ans = partition(arr, 0, arr.length - 1);
		System.out.println(ans);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int partition(int[] arr, int si, int ei) {
		int item = arr[ei];
		int pi = si;
		for (int i = si; i < ei; i++) {
			if(arr[i]<item) {
				int ii = arr[i];
				arr[i]=arr[pi];
				arr[pi]=ii;
				pi++;
			}
		}
		int ii = arr[ei];
		arr[ei]=arr[pi];
		arr[pi]=ii;
		return pi;
	}

}
