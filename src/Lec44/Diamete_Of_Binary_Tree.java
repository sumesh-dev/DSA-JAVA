package Lec44;

public class Diamete_Of_Binary_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int sd = ht(root.left) + ht(root.right) + 2;
			int ld = diameterOfBinaryTree(root.left);
			int rd = diameterOfBinaryTree(root.right);
			return Math.max(sd, Math.max(ld, rd));
		}

		private int ht(TreeNode root) {
			if (root == null) {
				return -1;
			}
			int left = ht(root.left);
			int right = ht(root.right);
			return Math.max(left, right) + 1;
		}
	}

}
