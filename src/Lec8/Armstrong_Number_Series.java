package Lec8;

import java.util.*;

public class Armstrong_Number_Series {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		while (n1 <= n2) {
			power(n1, n2);
			n1++;
		}
	}

	public static void power(int x, int y) {
		int sum = 0;
		int b = x;
		int r = count(x);
		while (x > 0) {
			int a = x % 10;
			sum = sum + (int) (Math.pow(a, r));
			x = x / 10;
		}
		if (b == sum) {
			System.out.println(b);
		}
	}

	public static int count(int n) {
		int i = 0;
		while (n > 0) {
			i++;
			n = n / 10;
		}
		return i;
	}
}