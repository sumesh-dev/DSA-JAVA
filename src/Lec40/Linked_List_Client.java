package Lec40;

//import java.util.LinkedList;

public class Linked_List_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linked_List ll = new Linked_List();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		ll.Display();
		ll.addfirst(40);
		ll.Display();
		ll.addatindex(2, -9);
		ll.Display();
		ll.addfirst(200);
		ll.addfirst(300);
		ll.addfirst(201);
		ll.addfirst(301);
		System.out.println(ll.GetFirst());
		System.out.println(ll.GetLast());
		System.out.println(ll.Getatindex(2));
		ll.Display();
		System.out.println(ll.removeFirst());
		ll.Display();
		System.out.println(ll.removeFirst());
		ll.Display();
		System.out.println(ll.removeatindex(2));
		ll.Display();

	}

}
