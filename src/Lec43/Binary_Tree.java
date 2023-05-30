package Lec43;

import java.util.Scanner;

public class Binary_Tree {
	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Binary_Tree() {
		this.root = Create_Tree();
	}

	private Node Create_Tree() {
		int item = sc.nextInt();
		Node n = new Node();
		n.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			n.left = Create_Tree();

		}
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			n.right = Create_Tree();

		}
		return n;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "";
		s = "<--" + nn.data + "-->";
		if (nn.left != null) {
			s = nn.left.data + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.data;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}

	public void postorder() {
		postorder(root);
		System.out.println();
	}

	private void postorder(Node nn) {
		if (nn == null)
			return;
		postorder(nn.left);
		postorder(nn.right);
		System.out.print(nn.data + " ");
	}

	public void Inorder() {
		inorder(root);
		System.out.println();
	}

	private void inorder(Node nn) {
		if (nn == null)
			return;
		inorder(nn.left);
		System.out.print(nn.data + " ");
		inorder(nn.right);
	}

	public void preorder() {
		preorder(root);
		System.out.println();
	}

	private void preorder(Node nn) {
		if (nn == null)
			return;
		System.out.print(nn.data + " ");
		preorder(nn.left);
		preorder(nn.right);

	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null)
			return false;
		if (nn.data == item) {
			return true;
		}
		boolean lf = find(nn.left, item);
		boolean rf = find(nn.right, item);
		return lf || rf;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if (node == null)
			return Integer.MIN_VALUE;
		int left = max(node.left);
		int right = max(node.right);
		return Math.max(node.data, Math.max(left, right));

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		if (node == null)
			return -1;
		int left = ht(node.left);
		int right = ht(node.right);
		return Math.max(left, right) + 1;
	}
}
