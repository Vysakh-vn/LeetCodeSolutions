package tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreOrderTraversal {
	
    List<Integer> list = new LinkedList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        doPreorderTraversal(root);
        return list;
    }

    public void doPreorderTraversal(TreeNode root) {
        if(root == null) return;
        list.add(root.val);
        doPreorderTraversal(root.left);
        doPreorderTraversal(root.right);
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
