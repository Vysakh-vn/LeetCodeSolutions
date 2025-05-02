package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal {

	List<Integer> list = new ArrayList<>();

	public List<Integer> inorderTraversal(TreeNode root) {
		inOrderTraversal(root);
		return list;
	}

	public void inOrderTraversal(TreeNode node) {
		if (node == null)
			return;
		inOrderTraversal(node.left);
		list.add(node.val);
		inOrderTraversal(node.right);
	}

	class TreeNode {

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
}
