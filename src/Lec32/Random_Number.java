package Lec32;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int lo = 10, hi = 20;
		for (int i = 0; i < 4; i++) {
			int r = rn.nextInt(hi - lo + 1) + lo;
			System.out.print(r + " ");
		}
	}

}
