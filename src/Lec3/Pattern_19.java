package Lec3;

import java.util.*;

public class Pattern_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n / 2 + 1;
		int space = -1;
		while (row <= n) {
			int k = 1;
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int i = 1;
			if (row == 1 || row == n) {
				i = 2;
			}
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// Mirroring
			if (row < n / 2 + 1) {
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