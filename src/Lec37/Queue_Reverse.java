package Lec37;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamic_Queue dq = new Dynamic_Queue();
		dq.EnQueue(10);
		dq.EnQueue(30);
		dq.EnQueue(20);
		dq.EnQueue(40);
		dq.EnQueue(50);
		dq.Display();
		Reverse(dq);
		dq.Display();
	}

	private static void Reverse(Dynamic_Queue dq) throws Exception {
		if (dq.isEmpty()) {
			return;
		}
		int val = dq.DeQueue();
		Reverse(dq);
		dq.EnQueue(val);

	}

}
