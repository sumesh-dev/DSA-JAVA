package Lec45;

public class Dia_of_bt_opt {
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

	public class DiaPair {
		int ht = -1;
		int d = 0;

	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).d;

		}

		public DiaPair diameter(TreeNode root) {
			if (root == null)
				return new DiaPair();
			DiaPair ldp = diameter(root.left);
			DiaPair rdp = diameter(root.right);
			DiaPair sdp = new DiaPair();
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			int d = ldp.ht + rdp.ht + 2;
			sdp.d = Math.max(d, Math.max(ldp.d, rdp.d));
			return sdp;
		}
	}

}
