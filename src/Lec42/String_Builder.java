package Lec42;

public class String_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append('c');
		sb.append("hello");
		System.out.println(sb);
		String str = sb.toString();
		System.out.println(str);
		System.out.println(sb.reverse());
		System.out.println(sb);
		String s = "HelloBye";
		StringBuilder sb1 = new StringBuilder(s);
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb1.append("HelloBye");
		sb1.append("HelloBye");
		sb1.append("cc");
		System.out.println(sb1);
		System.out.println(sb1.length() + " " + sb1.capacity());
//		sb1.append(2,'c');
		sb1.setCharAt(2, 'c');
		System.out.println(sb1);
		System.out.println(sb1.indexOf("He"));
		System.out.println(sb1.delete(1, 3));
		System.out.println(sb1.charAt(5));

	}

}
