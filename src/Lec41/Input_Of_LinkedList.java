package Lec41;

import Lec40.Linked_List.Node;

public class Input_Of_LinkedList {
	public class Node {
		int val;
		Node next;
	}

	private Node head;// 1st node address yaad krega every LinkedList
	private Node tail;// last node address yaad krega every LinkedList
	private int size;// total no of node in linkedlist

	// o(1)
	public void addfirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}

	}// O(1)

	public void addlast(int item) {
		if (size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public int middleNode() {
		return middleNode(head).val;
	}

	public Node middleNode(Node head) {

		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
