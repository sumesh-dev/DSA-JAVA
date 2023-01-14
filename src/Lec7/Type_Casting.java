package Lec7;

import java.util.*;

public class Type_Casting {
	public static void main(String[] args) {
		byte b = (byte) (132);
		byte b2 = 15;
		System.out.println(b);
		int i = 3;
		short s = 677;
		byte b1 = (byte) (i);
		System.out.println(b1);
		byte b4 = 14;
		int ii = b4;
		System.out.println(ii);
		long l1 = 766666667;
		long l2 = 6;
		long c = l1 + l2;
		System.out.println(c);
	}
}