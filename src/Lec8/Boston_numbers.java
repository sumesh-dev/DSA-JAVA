package Lec8;

import java.util.*;

public class Boston_numbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Bostonnumbers(n);
	}

	public static void Bostonnumbers(int n) {
		int x = n;
		int sum = 0;
		int i = 2;
		while (i <= n) {
			while (n % i == 0) {
				sum += sod(i);
				n = n / i;
			}
			i++;
		}
		int ans = sod(x);
		if (ans == sum) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public static int sod(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}
}