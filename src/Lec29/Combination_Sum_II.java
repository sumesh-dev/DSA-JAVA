package Lec29;

import java.util.*;

public class Combination_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 10, 1, 2, 7, 6, 1, 5 };
		Arrays.sort(coin);
		int amount = 8;
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<>();
		printanswer(coin, amount, ans, 0, list);
		System.out.println(ans);
	}

	public static void printanswer(int[] coin, int amount, List<List<Integer>> ans, int last, List<Integer> list) {
		if (amount == 0) {
			ans.add(new ArrayList<>(list));
			return;
		}
		for (int i = last; i < coin.length; i++) {
			if (i != last && coin[i] == coin[i - 1]) {
				continue;
			}
			if (amount >= coin[i]) {
				list.add(coin[i]);
				printanswer(coin, amount - coin[i], ans, i + 1, list);
				list.remove(list.size() - 1);
			}
		}
	}

}
