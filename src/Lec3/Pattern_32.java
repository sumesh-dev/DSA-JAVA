package Lec3;

import java.util.*;

public class Pattern_32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		int value = 1;
		while (row <= 2 * n - 1) {
			int j = 1;
			while (j <= star) {
				if (j % 2 == 0) {
					System.out.print("*\t");
				} else {
					System.out.print(value + "\t");
				}
				j++;
			}
			if (row < n) {
				star += 2;
				value++;
			} else {
				star -= 2;
				value--;
			}
			row++;
			System.out.println();
		}
	}
}