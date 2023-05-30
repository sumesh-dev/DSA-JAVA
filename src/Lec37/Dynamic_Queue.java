package Lec37;

import Lec35.Queues;

public class Dynamic_Queue extends Queues {
	@Override
	public void EnQueue(int item) throws Exception {
		if (isFull()) {
			int[] newarr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + 1) % arr.length;
				newarr[i] = arr[idx];
			}
			arr = newarr;
			front = 0;
		}
		super.EnQueue(item);
	}
}
