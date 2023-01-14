package Lec16;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";//pool
		String s1 = "Hello";//pool
		String s2 = new String("Bye");//heap
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		String s3=s+s1;
		System.out.println(s3);
		String s4 = "hello"+"Bye";//pool
		String s6 = s1+s;
		String s7 = s1+s;
		System.out.println(s6==s7);
	}

}
