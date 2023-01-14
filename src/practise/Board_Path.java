package practise;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int count = (BoardPath(0, n, ""));
		System.out.println();
		System.out.println(count);
	}

	public static int BoardPath(int curr, int n, String ans) {
		if (curr == n) {
			System.out.print(ans+" ");
			return 1;
		}
		if (curr > n)
			return 0;
		int a1 = 0;
		for (int i = 1; i <= 3; i++)
			a1 = a1 + BoardPath(curr + i, n, ans + i);
		return a1;
//		BoardPath(curr + 1, n, ans+1);
//		BoardPath(curr + 2, n, ans+2);
//		BoardPath(curr + 3, n, ans+3);
	}
}
