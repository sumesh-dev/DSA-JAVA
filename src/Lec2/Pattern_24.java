package Lec2;

import java.util.*;

public class Pattern_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int number = 1;
		int space = 8;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			while (j <= number) {
				System.out.print(row + " \t");
				j++;
			}
			System.out.println();
			row++;
			space--;
			number = number + 2;
		}
	}
}