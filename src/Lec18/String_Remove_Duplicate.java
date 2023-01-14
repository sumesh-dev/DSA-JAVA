package Lec18;

import java.util.*;

public class String_Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = 0;
		for (i = 0; i < s.length() - 1; i++) {
			System.out.print(s.charAt(i));
			while (i < s.length() - 1 && s.charAt(i + 1) == s.charAt(i)) {
				i++;
			}
		}
		if (s.charAt(s.length()-1) != s.charAt(s.length()-2)) {
			System.out.print(s.charAt(i));
		}
	}
}
