package Lec3;

import java.util.*;

public class Pattern_31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		int mark = n;
		int row = 1;
		int value = n;
		while (row <= n) {
			int j = 1;
			while (j <= star) {
				if (j == mark) {
					System.out.print("*\t");
					j++;
				} else {
					System.out.print(value + "\t");
					j++;
					value--;
				}
			}
			row++;
			value = n;
			mark--;
			System.out.println();
		}
	}
}