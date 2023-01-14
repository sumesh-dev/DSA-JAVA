package Lec23;

import java.util.*;

public class Length_of_longest_substring_without_repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		length(str);

	}

	public static void length(String s) {
		int count = 0;
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			count = 1;
			boolean flag = false;
			for (int j = i + 1; j < s.length(); j++) {
				for (int k = i; k < j; k++) {
					if (s.charAt(k) == s.charAt(j)) {
						flag = true;
						break;
					}
				}
				if (flag == false) {
					count++;
				} else {
					break;
				}
			}
			ans = Math.max(ans, count);
		}
		System.out.println(ans);
	}

}
