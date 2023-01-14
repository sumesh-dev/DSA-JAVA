package Lec10;

import java.util.*;

public class Array_Target_Sum_Pair_Hackerblocks
{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i =0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			}
		int sum = sc.nextInt();
		add(arr,sum);
		}

	public static void add(int [] arr , int sum){
		for (int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if (arr[i]+arr[j]==sum){
					if (arr[i]<arr[j]){
						System.out.println(arr[i]+" and "+arr[j]);
					}else{
						System.out.println(arr[j]+" and "+arr[i]);
					}
			}
		} 
	}
}
}