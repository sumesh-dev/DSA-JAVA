package Lec26;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 6,7 };
		int amount = 7;
		printanswer(coin, amount, "", 0);

	}

	public static void printanswer(int[] coin, int amount, String ans, int last) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = last; i < coin.length; i++) {
			if (amount >= coin[i]) {
				printanswer(coin, amount - coin[i], ans + coin[i], i);
			}
		}
	}

}
