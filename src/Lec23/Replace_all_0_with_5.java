package Lec23;

import java.util.*;

public class Replace_all_0_with_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n != 0) {
			Replace(n);
		} else {
			System.out.println(5);
		}
	}

	public static void Replace(int n) {
		if (n == 0) {
			return;
		}
		Replace(n / 10);
		if (n % 10 == 0 || n == 0) {
			System.out.print(5);
		} else {
			System.out.print(n % 10);
		}
	}

}
