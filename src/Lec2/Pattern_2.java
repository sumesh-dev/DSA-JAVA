package Lec2;

import java.util.*;

public class Pattern_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = row;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// next row
			row++;
			star++;
			System.out.println();
		}
	}
}