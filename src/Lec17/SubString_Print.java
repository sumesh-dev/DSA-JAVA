package Lec17;

public class SubString_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Bye";
		print_sub_string(str);
	}

	public static void print_sub_string(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
			//	System.out.println(str.substring(i, j));
				String s = str.substring(i,j);
				if(ispalindrome(s)==true) {
					System.out.println(s);
				}
			}
		}
	}
	public static boolean ispalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}


}
