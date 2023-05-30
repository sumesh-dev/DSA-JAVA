package Lec41;

import java.util.Scanner;

public class client_ll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Input_Of_LinkedList ll = new Input_Of_LinkedList();
		for (int i = 0; i < 5; i++) {
			ll.addlast(sc.nextInt());

		}
		System.out.println(ll.middleNode());
		
		
		

	}

}
