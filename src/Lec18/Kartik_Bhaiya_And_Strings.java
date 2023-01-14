package Lec18;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abababbaaaaabbb";
		int k = 3;
		int a = flipchar(str, k, 'a');
		int b = flipchar(str, k, 'b');
		System.out.println(Math.max(a, b));
	}

	public static int flipchar(String str, int k, char ch) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		while (ei < str.length()) {
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// shrink karna hai
			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}

}
