package Lec35;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queues q = new Queues();
		q.EnQueue(7);
		q.EnQueue(5);
		q.EnQueue(10);
		q.EnQueue(2);
		System.out.println(q.DeQueue());
		System.out.println(q.DeQueue());
		q.EnQueue(66);
		q.EnQueue(45);
		q.EnQueue(21);
		q.Display();
		System.out.println(q.size());

	}

}
