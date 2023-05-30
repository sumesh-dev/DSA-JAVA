package Lec42;

import java.util.LinkedList;

public class Java_ll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);// last me add karega
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		System.out.println(ll.remove());// 1st remove karega
		System.out.println(ll);
		ll.add(2, -9);
		System.out.println(ll);
	}

}
