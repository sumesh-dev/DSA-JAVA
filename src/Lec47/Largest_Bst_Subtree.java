package Lec47;

public class Largest_Bst_Subtree {
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

	public class BstPair {
		int size = 0;
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		boolean isbst = true;
	}

	class Solution {
		public int largestBSTSubtree(TreeNode root) {
			return largestbst(root).size;

		}

		public BstPair largestbst(TreeNode root) {
			if (root == null)
				return new BstPair();
			BstPair lbstp = largestbst(root.left);
			BstPair rbstp = largestbst(root.right);
			BstPair sbstp = new BstPair();
			sbstp.min = Math.min(root.val, Math.min(lbstp.min, rbstp.min));
			sbstp.max = Math.max(root.val, Math.max(lbstp.max, rbstp.max));
			if (lbstp.isbst && rbstp.isbst && lbstp.max < root.val && rbstp.min > root.val) {
				sbstp.isbst = true;
				sbstp.size = lbstp.size + rbstp.size + 1;
			} else {
				sbstp.isbst = false;
				sbstp.size = Math.max(lbstp.size, rbstp.size);

			}
			return sbstp;
		}

	}
}
