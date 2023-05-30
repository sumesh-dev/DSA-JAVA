package Lec35;

public class Stacks_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stacks s = new Stacks();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());
		System.out.println(s.pop());
		s.Display();
		s.push(60);
		s.push(30);
		s.push(22);
		System.out.println(s.size());
		s.Display();

	}

}
