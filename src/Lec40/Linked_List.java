package Lec40;

import java.util.*;

public class Linked_List {
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

	// O(1)
	public int GetFirst() throws Exception {
		if (size == 0) {
			throw new Exception("bklol linked list khali hai");
		}
		return head.val;
	}

	// O(1)
	public int GetLast() throws Exception {
		if (size == 0) {
			throw new Exception("bklol linked list khali hai");
		}
		return tail.val;
	}

	// O(N)
	public int Getatindex(int k) throws Exception {
		return GetNode(k).val;
	}

	// O(1)
	public int removeFirst() throws Exception {
		if (size == 0) {
			throw new Exception("Bklol linked list khali hai");
		}
		Node temp = head;
		head = head.next;
		if (size == 1) {
			tail = null;
		}
		size--;
		temp.next = null;
		return temp.val;
	}

	public int removeLast() throws Exception {
		if (size == 0) {
			throw new Exception("Bklol linked list khali hai");
		}
		if (size == 1) {
			return removeFirst();
		} else {
			Node n = GetNode(size - 2);
			Node temp = tail;
			tail = n;
			tail.next = null;
			size--;
			return temp.val;
		}
	}

	// O(N)
	public int removeatindex(int k) throws Exception {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeLast();
		} else {
			Node curr = GetNode(k);
			Node prev = GetNode(k - 1);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;

		}
	}

	// O(N)
	public void addatindex(int k, int item) throws Exception {
		if (k == 0) {
			addfirst(item);
		} else if (k == size - 1) {
			addlast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node k_1 = GetNode(k - 1);
			nn.next = k_1.next;
			k_1.next = nn;
			size++;
		}
	}

	public Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Index Valid dedo bklol");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;

	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

}
