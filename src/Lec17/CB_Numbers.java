package Lec17;

import java.util.*;

public class CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		printsubstring(s);
	}

	public static void printsubstring(String s) {
		int count = 0;
		boolean[] vis = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String s1 = s.substring(i, j);
				// Integer.parseInt(s) numeric string to int conversion;
				// Long.parseLong(s) numeric string to long conversion;
				if (isCbNumber(Long.parseLong(s1)) == true && isvisited(vis, i, j - 1) == true) {
					count++;
					for (int k = i; k < j; k++) {
						vis[k] = true;
					}
				}
			}
		}
		System.out.println(count);
	}

	public static boolean isvisited(boolean[] vis, int i, int j) {
		for (int k = i; k <= j; k++) {
			if (vis[k] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCbNumber(long n) {
		if (n == 0 || n == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
}