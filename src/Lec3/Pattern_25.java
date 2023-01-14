package Lec3;

import java.util.*;

public class Pattern_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		int value = 1;
		int space = n - 1;
		while (row <= n + 1 / 2) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print(value + "\t");
				j++;
				value++;
			}
			space--;
			star += 2;
			row++;
			System.out.println();
		}
	}
}