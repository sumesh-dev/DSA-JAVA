package Lec3;

import java.util.*;

public class Pattern_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		int row = 1;
		int value = n;
		while (row <= n) {
			int j = 1;
			while (j <= star) {
				System.out.print(value + "\t");
				j++;
				value--;
			}
			row++;
			value = n;
			System.out.println();
		}
	}
}