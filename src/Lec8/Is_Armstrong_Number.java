package Lec8;

import java.util.*;

public class Is_Armstrong_Number {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(power(n));

	}

	public static boolean power(int x) {
		int sum = 0;
		int b = x;
		int r = count(x);
		while (x > 0) {
			int a = x % 10;
			sum = sum + (int) (Math.pow(a, r));
			x = x / 10;
		}
		if (b == sum) {
			return true;
		} else {
			return false;
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