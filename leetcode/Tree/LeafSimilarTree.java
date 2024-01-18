package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeafSimilarTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        enterLeaves(root1, queue1);
        enterLeaves(root2, queue2);
        
        return queue1.equals(queue2);
    }

    void enterLeaves(TreeNode root, Queue<Integer> queue) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                queue.add(root.val);
            }
            enterLeaves(root.left, queue);
            enterLeaves(root.right, queue);
        }
    }
}