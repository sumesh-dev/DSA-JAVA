package Lec32;

public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 29;
		System.out.println(isitprime(n));
	}

	public static boolean isitprime(int n) {
		int i = 2;
		for (; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
