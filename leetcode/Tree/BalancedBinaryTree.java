package Tree;
public class BalancedBinaryTree {
    
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
    
    static int height(TreeNode tree)
    {
        if(tree==null) return 0;
        int leftHeight = height(tree.left);
        int rightHeight = height(tree.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    
    static boolean isSubtreeBalanced(TreeNode node) 
    {
        if (node == null) {
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        
        return isSubtreeBalanced(node.left) && isSubtreeBalanced(node.right);
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSubtreeBalanced(root);
    }
}