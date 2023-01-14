package practise;

public class Tower_of_hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "A";
		String hlp = "B";
		String dest = "C";
		int n = 3;
		TOH(n,src,hlp,dest);
	}
	public static void TOH(int n, String src, String help, String dest) {
		if(n==0) 
			return;
		TOH(n-1,src,dest,help);
		System.out.println(" Moved "+ n + "th from " +src+" to "+ dest);
		TOH(n-1,help,src,dest);
	}
}
