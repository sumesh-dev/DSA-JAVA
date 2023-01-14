package Lec27;

import java.util.*;

public class Replace_All_Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			replace(str, 0);
			System.out.print(str.charAt(str.length() - 1));
			System.out.println();
		}

	}

	public static void replace(String str, int i) {
		if (i == str.length() - 1) {
			return;
		}
		if (str.charAt(i) == 'p' && str.charAt(i + 1) == 'i') {
			System.out.print("3.14");
			i++;
		} else {
			System.out.print(str.charAt(i));
		}
		replace(str, i + 1);
	}

}
