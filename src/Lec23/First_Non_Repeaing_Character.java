package Lec23;

import java.util.*;

public class First_Non_Repeaing_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str = sc.next();
			First_Non_Repeat(str);
		}
	}

	public static void First_Non_Repeat(String s) {
		int i = 0;
		for (i = 0; i < s.length(); i++) {
			boolean count = false;
			int j = 0;
			while (j < s.length() - 1) {
				if (i == j) {
					j++;
				}
				if (s.charAt(i) == s.charAt(j)) {
					j = s.length();
					count = true;
				}
				j++;
			}
			if (count == false) {
				System.out.println(s.charAt(i));
				return;
			}
		}
		System.out.println(-1);
	}
}