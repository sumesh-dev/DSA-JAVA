package Lec37;

public class Queue_Dequeue_Efficient {
	private Dynamic_Stack ds = new Dynamic_Stack();

	private boolean isempty() {
		return ds.isEmpty();
	}

	private int size() {
		return ds.size();

	}

	private void Enqueue(int item) throws Exception {// O(n)
		Dynamic_Stack hlp = new Dynamic_Stack();
		while (!ds.isEmpty()) {
			hlp.push(ds.pop());

		}
		ds.push(item);
		while (!hlp.isEmpty()) {
			ds.push(hlp.pop());
		}
	}

	private int DeQueue() throws Exception {// O(1)
		return ds.pop();
	}

	private int getFront() throws Exception {// O(1)
		return ds.peek();
	}

	private void Display() throws Exception { // O(n)
		Dynamic_Stack hlp = new Dynamic_Stack();
		while (!ds.isEmpty()) {
			hlp.push(ds.pop());
		}
		hlp.Display();
		ds = hlp;
	}

	public static void main(String[] args) throws Exception {
		Queue_Dequeue_Efficient dqf = new Queue_Dequeue_Efficient();
		dqf.Enqueue(10);
		dqf.Enqueue(20);
		dqf.Enqueue(30);
		dqf.Enqueue(40);
		dqf.Enqueue(50);
		System.out.println(dqf.DeQueue());
		System.out.println(dqf.DeQueue());
		System.out.println(dqf.getFront());
		dqf.Enqueue(60);
		dqf.Enqueue(70);
		System.out.println(dqf.DeQueue());
		System.out.println(dqf.getFront());
		dqf.Display();
	}

}
