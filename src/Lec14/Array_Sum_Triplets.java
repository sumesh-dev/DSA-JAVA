package Lec14;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sum_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int targetSum = sc.nextInt();
		Arrays.sort(arr);
		for (int i = 0; i < size-1; i++) {
			for (int j = i + 1; j < size-1; j++) {
				sum = arr[i]+arr[j];
				if(arr[j]<targetSum-sum) {
					if(binarySearch(arr, targetSum-sum)) {
						System.out.print(arr[i]+", "+arr[j]+" and "+(targetSum-sum));
						System.out.println();
					}
				}
				}
				
		}
//		int[] arr = {2,3,4,5,6,7,8};
//		System.out.println(binarySearch(arr, 3));
	}

	public static boolean binarySearch(int [] arr,int n) {
		int start = 0, end= arr.length-1;
		int mid = (start+end)/2;
		while(start<=end) {
			if(arr[mid]==n) {
				return true;
			}
			else if(arr[mid]>n) {
					end = mid-1;
					mid = (start + end)/2;
					}
			else {
					start = mid+1;
					mid = (start+end)/2;
				}
					
		}
		return false;
//		for(int i=0;i<mid;i++) {
//			
//		}
//		return 
	}
}
