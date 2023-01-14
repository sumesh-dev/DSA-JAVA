package Lec3;

import java.util.*;

public class Pattern_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		int space2 = -1;
		int space = n / 2;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			int k = 1;
			while (k <= space2) {
				System.out.print("  ");
				k++;
			}
			int l = 1;
			if (row == 1 || row == n) {
				l = 2;
			}
			while (l <= star) {
				System.out.print("* ");
				l++;
			}
			if (row < n / 2 + 1) {
				space--;
				space2 += 2;
			} else {
				space++;
				space2 -= 2;
			}
			row++;
			System.out.println();
		}
	}
}