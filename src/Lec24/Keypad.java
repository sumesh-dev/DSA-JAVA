package Lec24;

import java.util.*;

public class Keypad {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "23";
		List<String> list = new ArrayList<>();
		if (str.length() == 0) {
			System.out.println(list);
		}
		keypress(str, "", list);
		System.out.println(list);
	}

	public static void keypress(String ques, String ans, List<String> list) {
		if (ques.length() == 0) {
			list.add(ans);
//			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String press = key[ch - '0'];
		for (int i = 0; i < press.length(); i++) {
			keypress(ques.substring(1), ans + press.charAt(i), list);
		}
	}

}
