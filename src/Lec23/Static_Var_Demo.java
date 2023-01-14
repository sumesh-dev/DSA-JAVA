package Lec23;

public class Static_Var_Demo {

	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(val);
		fun();
		System.out.println(val);
	}

	public static void fun() {
		System.out.println(val);
		val = val + 6;
		int val = 50;
		System.out.println(val);
		Static_Var_Demo.val += 4;

	}

}
