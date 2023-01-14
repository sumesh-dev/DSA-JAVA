package Lec29;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int k = 3;
		boolean[] board = new boolean[n];
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		printanswer(board, k, 0, list, 0, ans, n);
		System.out.println(ans);
	}

	public static void printanswer(boolean[] board, int k, int qpsf, List<Integer> list, int last,
			List<List<Integer>> ans, int n) {
		if (k == qpsf) {
			int sum = 0;
			for (int val : list) {
				sum += val;
			}
			if (sum == n) {
				ans.add(new ArrayList<Integer>(list));
				return;
			}
		}
		for (int i = last; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				list.add(i + 1);
				printanswer(board, k, qpsf + 1, list, i + 1, ans, n);
				board[i] = false;
				list.remove(list.size() - 1);
			}
		}
	}

}
