package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
	
    int count = 0;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();            
            for(int i = 0; i < size; i ++) {
                TreeNode node = queue.poll();
                if(isLeafNode(node)) return depth;
                if(node.right != null) queue.add(node.right);
                if(node.left != null) queue.add(node.left);
            }
            depth ++;
        }
        return 0;
    }

    private boolean isLeafNode(TreeNode node) {
        return node.right == null && node.left == null;
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
