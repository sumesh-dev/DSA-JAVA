package Lec18;

import java.util.*;

public class Strings_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		compress(str);
	}

	public static void compress(String str) {
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			count = 1;
			System.out.print(str.charAt(i));
			while (str.charAt(i) == str.charAt(i + 1) && i < str.length() - 2) {
				count++;
				i++;
			}
			if (count > 1 && str.charAt(i) != str.charAt(i+1)) {
				System.out.print(count);
			}
		}
		if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2)) {
			count++;
			System.out.print(count);
		} else {
			System.out.print(str.charAt(str.length() - 1));
		}
	}

}
