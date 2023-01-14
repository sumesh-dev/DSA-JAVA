package Lec32;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 41;
		printprime(n);
	}

	public static void printprime(int n) {
		boolean[] arr = new boolean[n + 1];
		arr[0] = true;
		arr[1] = true;
		for (int i = 2; i * i <= n; i++) {
			if (arr[i] == false) {
				for (int mul = 2; i * mul <= n; mul++) {
					arr[mul * i] = true;
				}
			}
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == false) {
				System.out.print(i + " ");
			}
		}
	}

}
