package Lec2;

import java.util.*;

public class Pattern_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = 0;
		int star = n;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("    ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// next row
			row++;
			star--;
			space += 2;
			System.out.println();
		}
	}
}