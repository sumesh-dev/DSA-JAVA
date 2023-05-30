package Lec36;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 4));
		System.out.println(add(2, 4, 9));
		System.out.println(add(2, 4, 9.6f));
		System.out.println(add(2, 3, 4, 5, -3, 6, 8, 8, 89, 55, 11, 119, 15, 20));

	}

	public static int add(int x, int z, int... a) {// variable no argument //triple dot variable
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return x + z + sum;
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, float c) {
		return (int) (a + b + c);
	}

	public static int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

}
