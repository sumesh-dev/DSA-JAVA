package practise;

public class DuplicatePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("abca","");
	}
	public static void permutation(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		boolean[] visited = new boolean[26];
		for(int i=0;i<ques.length();i++) {
			char ch =ques.charAt(i);
			if(visited[ch-'a'] == false) {
				visited[ch-'a']=true;
			String s1= ques.substring(0,i);
			String s2 = ques.substring(i+1);
			permutation(s1+s2, ans +ch);
			}
		}
	}

}
