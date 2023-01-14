package Lec23;

public class Count_Of_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println("Total Subsequence - " + printanswer(str, ""));
	}

	public static int printanswer(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int a = printanswer(ques.substring(1), ans);
		int b = printanswer(ques.substring(1), ans + ch);
		return a + b;
	}

}
