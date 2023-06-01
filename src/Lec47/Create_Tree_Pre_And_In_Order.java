package Lec47;

public class Create_Tree_Pre_And_In_Order {
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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return CreateTree(inorder, 0, inorder.length - 1, preorder, 0, preorder.length - 1);
		}

		public TreeNode CreateTree(int[] inorder, int ilo, int ihi, int[] preorder, int plo, int phi) {
			if (plo > phi || ilo > ihi) {
				return null;
			}
			TreeNode node = new TreeNode(preorder[plo]);
			int idx = search(inorder, ilo, ihi, preorder[plo]);
			int nel = idx - ilo;// inorder me left subtree total node count hai
			node.left = CreateTree(inorder, ilo, idx - 1, preorder, plo + 1, plo + nel);
			node.right = CreateTree(inorder, idx + 1, ihi, preorder, plo + nel + 1, phi);
			return node;
		}

		public int search(int[] in, int si, int ei, int item) {
			for (int i = si; i <= ei; i++) {
				if (in[i] == item) {
					return i;
				}

			}
			return 0;
		}
	}

}
