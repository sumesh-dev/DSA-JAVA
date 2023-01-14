package Lec15;
import java.util.*;
public class Divisible_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			int n = sc.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(GoodSubArray(arr));
		}
	}
	public static long GoodSubArray(int[]arr) {
		int n = arr.length;
		long [] freq = new long[arr.length];
		long sum = 0;
		freq[0]=1;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			int idx = (int)(sum%n);
			if(idx<0) {
				idx+=n;
			}
			freq[idx]=freq[idx]+1;
		}
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if(freq[i]>=2) {
				long p = freq[i];
				ans+=(p*(p-1))/2;
			}
		}
		return ans;
	}

}