package Lec12;
import java.util.*;

public class Pair_Of_Roses_Hackerblocks {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		for(int j=1; j<=x; j++){
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		sort(arr);
		int money = sc.nextInt();
		sum(arr,money);
		}
	}
	public static void sort(int[]arr){
		for(int i = 0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[i]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void sum(int[] arr,int money){
		int c =Integer.MAX_VALUE;
		int x=0;
		int y = 0;
		for(int i = 0; i<arr.length; i++){
			for(int j = arr.length-1; i<j ; j--){
				if(arr[i]+arr[j]>money){
				}else if(arr[i]+arr[j]==money && c>arr[j]-arr[i]){
						x=arr[i];
						y=arr[j];
						c=arr[j]-arr[i];
				}else{
					}
			}}
			if(x!=0 &&y!=0 ){
			System.out.println("Deepak should buy roses whose prices are "+x+" and "+y+".");
	}}
}