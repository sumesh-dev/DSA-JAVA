package Lec37;

import Lec35.Stacks;

public class Dynamic_Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stacks ds = new Dynamic_Stack();
		ds.push(55);
		ds.push(60);
		ds.pop();
		ds.push(53);
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.Display();

	}

}
