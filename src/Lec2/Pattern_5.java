package Lec2;

import java.util.*;

public class Pattern_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 5;
		int space = 0;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("   ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row++;
			space++;
			star--;
		}
	}
}