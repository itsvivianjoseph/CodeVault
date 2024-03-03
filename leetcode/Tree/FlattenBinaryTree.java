package Tree;

import java.util.Stack;

public class FlattenBinaryTree {
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

    public TreeNode flatten(TreeNode root) {
        preOrder(root);
        return root;
    }
    public void preOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            if(curr.right != null) stack.push(curr.right);
            if(curr.left != null) stack.push(curr.left);
            if(!stack.isEmpty()) curr.right = stack.peek();
            curr.left = null;
        }
    }
    public static void main(String[] args) {
        FlattenBinaryTree flattenBinaryTree = new FlattenBinaryTree();

        // Creating a sample binary tree
        //       1
        //      / \
        //     2   5
        //    / \   \
        //   3   4   6
        FlattenBinaryTree.TreeNode root = flattenBinaryTree.new TreeNode(1,
                flattenBinaryTree.new TreeNode(2, flattenBinaryTree.new TreeNode(3), flattenBinaryTree.new TreeNode(4)),
                flattenBinaryTree.new TreeNode(5, null, flattenBinaryTree.new TreeNode(6)));

        // Print the original binary tree
        System.out.println("Original Binary Tree:");
        printTree(root);

        // Flatten the binary tree
        flattenBinaryTree.flatten(root);

        // Print the flattened binary tree
        System.out.println("\nFlattened Binary Tree:");
        printlist(root);
    }
    static void printlist(TreeNode root){
        while(root.right != null){ 
            System.out.println(root.val);
            root = root.right;
        }
    }

    // Helper method to print the tree in pre-order traversal
    private static void printTree(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printTree(root.left);
            printTree(root.right);
        }
    }
}
