package Lec3;

import java.util.*;

public class Pattern_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		int row = 1;
		int space = -1;
		while (row <= n + 1 / 2) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if (row == 1) {
				k = 2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			space += 2;
			star--;
			row++;
			System.out.println();
		}
	}
}