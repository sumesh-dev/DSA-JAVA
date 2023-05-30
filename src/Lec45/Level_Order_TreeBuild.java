package Lec45;

import java.util.*;

public class Level_Order_TreeBuild {
	public class Node {
		int val;
		Node right;
		Node left;
	}

	private Node root;

	public Level_Order_TreeBuild() {
		root = CreateTree();
	}

	private Node CreateTree() {
		Scanner sc = new Scanner(System.in);
		Queue<Node> q = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		q.add(nn);
		while (!q.isEmpty()) {
			Node rv = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node node = new Node();
				node.val = c1;
				rv.left = node;
				q.add(node);
			}
			if (c2 != -1) {
				Node node = new Node();
				node.val = c2;
				rv.right = node;
				q.add(node);
			}

		}
		return root;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		System.out.print(nn.val + " ");
		Display(nn.left);
		Display(nn.right);
	}

	public static void main(String[] args) {
		Level_Order_TreeBuild lv = new Level_Order_TreeBuild();
		lv.Display();
//		10 20 30 40 50 -1 60 -1 -1 -1 70 80 90 -1 -1 -1 -1 -1 -1
	}

}
