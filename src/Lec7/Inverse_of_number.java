package Lec7;

import java.util.*;

public class Inverse_of_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + i * Math.pow(10, rem - 1));
			n = n / 10;
			i++;
		}
		System.out.println(sum);
	}
}