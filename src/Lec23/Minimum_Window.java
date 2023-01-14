package Lec23;

public class Minimum_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.print(Minimum_Window(s, t));

	}

	public static String Minimum_Window(String s, String t) {
		int[] freq_t = new int[256];
		int[] freq_s = new int[256];
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			freq_t[ch]++;
		}
		int count = 0;
		int start = 0;
		int start_Index = -1;
		int min_length = Integer.MAX_VALUE;
		for (int end = 0; end < s.length(); end++) {
			char ch = s.charAt(end);
			freq_s[ch]++;
			if (freq_s[ch] <= freq_t[ch]) {
				count++;
			}
			if (count == t.length()) {
				while (freq_s[s.charAt(start)] > freq_t[s.charAt(start)] || freq_t[s.charAt(start)] == 0) {
					if (freq_s[s.charAt(start)] > freq_t[s.charAt(start)]) {
						freq_s[s.charAt(start)]--;
					}
					start++;
				}
				if (min_length > end - start + 1) {
					min_length = end - start + 1;
					start_Index = start;
				}
			}
		}
		if (start_Index == -1) {
			return "";
		}
		return s.substring(start_Index, start_Index + min_length);
	}

}