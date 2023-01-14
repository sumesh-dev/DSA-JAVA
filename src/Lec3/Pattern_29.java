package Lec3;

import java.util.*;

public class Pattern_29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		int value = 1;
		int space = n - 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			while (j <= star) {
				if (j == 1 || j == star) {
					System.out.print(value + "\t");
				} else {
					System.out.print("0 \t");
				}
				j++;
			}
			space--;
			star += 2;
			row++;
			value++;
			System.out.println();
		}
	}
}