package Lec16;

public class String_Difference_Ascii_Code {

	public static void main(String[] args) {
		String str = "acb";
		diff(str);
	}

	public static void diff(String str) {
		int i =0;
		for (i = 0; i < str.length()-1; i++) {
			int a = (int)(str.charAt(i));
			int b = (int)(str.charAt(i+1));
			int c = b-a;
			System.out.print(str.charAt(i)+""+c);
		}
		System.out.print(str.charAt(i));
	}
}