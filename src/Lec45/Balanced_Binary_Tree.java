package Lec45;

public class Balanced_Binary_Tree {
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
		public boolean isBalanced(TreeNode root) {
			if (root == null) {
				return true;
			}
			boolean ls = isBalanced(root.left);
			boolean rs = isBalanced(root.right);
			boolean sb = Math.abs(ht(root.left) - ht(root.right)) <= 1;
			return ls && rs && sb;
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
