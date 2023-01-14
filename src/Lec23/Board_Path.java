package Lec23;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = 3;
		System.out.println("Total Outcomes - " + BoardPath(0, n, ""));
	}

	public static int BoardPath(int curr, int n, String ans) {
		if (curr == n) {
			System.out.println(ans);
			return 1;
		}
		if (curr > n) {
			return 0;
		}
		int a1 = BoardPath(curr + 1, n, ans + 1);
		int b1 = BoardPath(curr + 2, n, ans + 2);
		int c1 = BoardPath(curr + 3, n, ans + 3);
		return a1 + b1 + c1;
	}

}
