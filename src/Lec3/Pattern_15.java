package Lec3;

import java.util.*;

public class Pattern_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 5;
		int space = 0;
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
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			row++;
			System.out.println();
		}
	}
}