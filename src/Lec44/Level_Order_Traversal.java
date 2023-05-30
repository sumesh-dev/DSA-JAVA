package Lec44;

import java.util.*;

public class Level_Order_Traversal {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node right;
		Node left;
	}

	private Node root;

	public void Level_Order() {
		this.root = create_Tree();
		LevelOrder();
	}

	private Node create_Tree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			nn.left = create_Tree();// left subtree
		}
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			nn.right = create_Tree();// right subtree
		}
		return nn;
	}

	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			// remove
			Node nn = q.poll();// 1st remove karega
			System.out.print(nn.data + " ");
			if (nn.left != null) {
				q.add(nn.left);
			}
			if (nn.right != null) {
				q.add(nn.right);
			}

		}
		System.out.println();
	}

	public static void main(String[] args) {
		Level_Order_Traversal ll = new Level_Order_Traversal();
		ll.Level_Order();
	}

}
