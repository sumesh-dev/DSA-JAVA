package Lec4;

import java.util.*;

public class HCF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		int dividend = sc.nextInt();
		int rem = 0;
		while (dividend % divisor != 0) {
			rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.print(divisor);
	}
}