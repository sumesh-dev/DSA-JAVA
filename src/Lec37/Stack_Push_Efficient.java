package Lec37;

public class Stack_Push_Efficient {
	private Dynamic_Queue dq = new Dynamic_Queue();

	public boolean isEmpty() {
		return dq.isEmpty();
	}

	public void push(int item) throws Exception {// O(1)
		dq.EnQueue(item);
	}

	public int size() {
		return dq.size();

	}

	public int pop() throws Exception {// O(n)
		Dynamic_Queue hlp = new Dynamic_Queue();
		while (dq.size() > 1) {
			hlp.EnQueue(dq.DeQueue());
		}
		int item = dq.DeQueue();
		dq = hlp;
		return item;
	}

	public int peek() throws Exception {// O(n)
		Dynamic_Queue hlp = new Dynamic_Queue();
		while (dq.size() > 1) {
			hlp.EnQueue(dq.DeQueue());
		}
		int item = dq.DeQueue();
		hlp.EnQueue(item);
		dq = hlp;
		return item;
	}

	public void Disply() throws Exception {
		Dynamic_Queue hlp = new Dynamic_Queue();
		while (dq.size() > 1) {
			hlp.EnQueue(dq.DeQueue());
		}
		hlp.Display();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_Push_Efficient spf = new Stack_Push_Efficient();
		spf.push(10);
		spf.push(20);
		spf.push(30);
		spf.push(40);
		spf.push(50);
		System.out.println(spf.pop());
		System.out.println(spf.pop());
		System.out.println(spf.peek());
		spf.push(-50);
		System.out.println(spf.peek());
		spf.Disply();

	}

}
