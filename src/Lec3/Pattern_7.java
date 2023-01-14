package Lec3;

import java.util.*;

public class Pattern_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		int row = 1;
		int space = n - 2;
		while (row <= n) {
			if (row == 1 || row == n) {
				int i = 1;
				while (i < star) {
					System.out.print("* ");
					i++;
				}
			} else {
				System.out.print("* ");
				int j = 1;
				while (j <= space) {
					System.out.print("  ");
					j++;
				}
			}
			System.out.print("* ");
			row++;
			System.out.println();
		}
	}
}