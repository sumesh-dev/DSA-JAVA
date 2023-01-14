package Lec18;

import java.util.*;

public class String_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			int a = str.charAt(i);
			if (i % 2 == 0) {
				a++;
			} else {
				a--;
			}
			char s = (char) (a);
			System.out.print(s);
		}
	}
}