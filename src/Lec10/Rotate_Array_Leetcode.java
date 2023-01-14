//This code is not much optimised
package Lec10;
import java.util.*;

public class Rotate_Array_Leetcode {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i =0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		rotate_array(arr,k);
		for (int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void rotate_array(int []arr , int k){
		int n = arr.length;
		k=k%n;
		while(k>0){
			int temp = arr[n-1];
			for (int i = n-2; i>=0; i--){
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
			k--;
		}
}
}