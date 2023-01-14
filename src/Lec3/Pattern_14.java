package Lec3;

import java.util.*;

public class Pattern_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= 2 * n - 1) {
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// Mirroring
			if (row < n) {
				star++;
				space--;
			} else {
				star--;
				space++;
			}
			row++;
			System.out.println();
		}
	}
}