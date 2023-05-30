package Lec37;

public class Dynamic_Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamic_Queue dq = new Dynamic_Queue();
		dq.EnQueue(23);
		dq.EnQueue(83);
		System.out.println(dq.DeQueue());
		dq.EnQueue(93);
		dq.EnQueue(53);
		System.out.println(dq.GetFront());
		dq.EnQueue(63);
		dq.EnQueue(33);
		dq.EnQueue(43);
		dq.EnQueue(13);
		dq.Display();

	}

}
