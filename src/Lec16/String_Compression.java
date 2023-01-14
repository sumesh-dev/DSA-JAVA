package Lec16;

import java.util.*;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		compress(s);
	}

	public static void compress(String str) {
		int i = 0;
		while (i < str.length()) {
			int count = 1;
			System.out.print(str.charAt(i));
			if (i < str.length() - 1) {
				while (str.charAt(i) == str.charAt(i + 1)) {
					count++;
					if (i + 1 == str.length() - 1) {
						System.out.println(count);
						return;
					}
					i++;
				}
				System.out.print(count);
				i++;
			} else {
				System.out.print(count);
				return;
			}
		}
	}
}