package Lec18;

import java.util.*;

public class Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		char q = 'z';
		for (int j = 0; j < s.length(); j++) {
			char ch = s.charAt(j);
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(j) == s.charAt(i))
					count++;
			}
			if(ans<count) {
				q = ch;
			}
			ans = Math.max(ans, count);
		}
		System.out.println(q);
	}

}
