package Lec7;

public class Char_Type {
	public static void main(String[] args) {
		char ch = 'a';
		int i = ch;
		System.out.println(i);
		int a = 45;
		ch = (char) (a);
		System.out.println(ch);
		ch++;
		System.out.println(ch);

	}
}