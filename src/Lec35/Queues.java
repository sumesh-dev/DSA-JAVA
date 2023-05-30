package Lec35;

public class Queues {
	protected int[] arr;
	protected int size;
	protected int front;

	public Queues() {
		arr = new int[5];
		size = 0;
		front = 0;
	}

	public Queues(int cap) {
		arr = new int[cap];
		size = 0;
		front = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == arr.length;
	}

	public int size() {
		return size;
	}

	public void EnQueue(int item) throws Exception {
		if (isFull() == true) {
			throw new Exception("Queue full");
		}
		// circular Queue
		int idx = (front + size) % arr.length;
		arr[idx] = item;
		size++;
	}

	public int DeQueue() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Queue Empty");
		}
		int val = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return val;
	}

	public int GetFront() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Queue Empty");
		}
		return arr[front];
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}

}
