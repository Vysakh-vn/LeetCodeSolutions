package tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostOrderTraversal {
	
    List<Integer> list = new LinkedList<>();

    /**
     * Function returns the post order traversal of the binary tree.
     * 
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        doPostOrderTraversal(root);
        return list;
    }

    public void doPostOrderTraversal(TreeNode root) {
        if(root == null) return;
        
        doPostOrderTraversal(root.left);
        doPostOrderTraversal(root.right);
        list.add(root.val);
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
