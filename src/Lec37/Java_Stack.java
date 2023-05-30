package Lec37;

import java.util.Stack;

public class Java_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(44);
		st.push(20);
		st.push(21);
		st.push(22);
		st.push(23);
		System.out.println(st.pop());
		System.out.println(st);
		st.push(26);
		System.out.println(st.size());
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
		System.out.println(st);
	}

}
