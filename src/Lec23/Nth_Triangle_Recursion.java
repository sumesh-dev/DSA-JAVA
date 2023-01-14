package Lec23;

import java.util.*;

public class Nth_Triangle_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(nth_Triangle(n, 0));
	}

	public static int nth_Triangle(int n, int ans) {
		if (n == 0) {
			return ans;
		}
		int a = nth_Triangle(n - 1, ans + 1);
		return a + ans;

	}
}