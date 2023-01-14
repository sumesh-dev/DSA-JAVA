package Lec16;

import java.util.*;

public class String_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		String s2 = sc.nextLine();
//		System.out.println(s);
//		System.out.println(s2);
		String s = "Hellookaybye";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		String s1 = new String("Hellookaybye");
		System.out.println(s.equals(s1));
		String s2 = "Raj";
		String s3="Raju";
		System.out.println(s2.compareTo(s3)); // s2>s3 +ve or s3>s2 -ve or s2 == s3 0
		System.out.println(s.substring(3));
		System.out.println(s.substring(4,5));
	}

}
