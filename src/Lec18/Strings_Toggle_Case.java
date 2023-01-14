package Lec18;

import java.util.*;

public class Strings_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		for(int i = 0; i<str.length(); i++) {
			int a = str.charAt(i);
			if (a>96 && a<123) {
				a=a-32;
			}
			else {
				a=a+32;
			}
			char ch = (char)(a);
			System.out.print(ch);
		}
	}

}
