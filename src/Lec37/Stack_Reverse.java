package Lec37;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(40);
		st.push(6);
		st.push(89);
		st.push(70);
		st.push(-2);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);

	}

	public static void Reverse(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}
		int item = st.pop();
		Reverse(st);
		Insert_Down(st, item);
	}

	public static void Insert_Down(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int i = st.pop();
		Insert_Down(st, item);
		st.push(i);
	}

}
