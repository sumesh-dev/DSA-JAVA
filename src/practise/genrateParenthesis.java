package practise;

public class genrateParenthesis {
	public static void main(String[] args) {
		int n=3;
		genrateParenthesi(n,0,0,"");
	}
	public static void genrateParenthesi(int n, int openCount, int closeCount, String ans) {
		if(openCount==n && closeCount==n) {
			System.out.println(ans);
			return;
		}
		if(openCount<n)
			genrateParenthesi(n,openCount+1,closeCount,ans + "(");
		if(openCount>closeCount)
			genrateParenthesi(n,openCount,closeCount+1,ans+")");
	}
}
