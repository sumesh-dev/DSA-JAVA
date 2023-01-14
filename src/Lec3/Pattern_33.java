package Lec3;

import java.util.*;

public class Pattern_33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		int value = n;
		int space = n - 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			while (j <= star) {
				if (j == row || row == 1) {
					System.out.print("0 \t");
					j++;
				} else {
					System.out.print(value + "\t");
					j++;
				}
				if (j <= row) {
					value++;
				} else {
					value--;
				}
			}
			space--;
			star += 2;
			row++;
			// value--;
			System.out.println();
		}
	}
}