import java.util.*;
import java.util.LinkedList;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.data = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.data = val;
        this.left = left;
        this.right = right;
    }
}

class Tree {
    TreeNode root ;
    Tree(){
        root = new TreeNode();
    }
    Tree(int val){
        root = new TreeNode(val);
    }
    static void BFS(TreeNode root) {
        if (root == null) {
            throw new Error("Empty Tree!!!");
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            System.out.println(curr.data);

            if (curr.left != null) {
                queue.offer(curr.left);
            }

            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
    }

    static void DFS(TreeNode root) {
        if (root == null) throw new Error("Empty Tree!!!");
    
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
    
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            System.out.println(curr.data);
    
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }
    static void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    
    public static void main(String[] args) {
        // Construct a simple binary tree
        // TreeNode root = new TreeNode(1);
        Tree tree = new Tree();
        tree.root.data = 1;
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        // System.out.println(tree.root.right);

        // Perform BFS traversal and print node values
        // BFS(tree.root);
        // DFS(tree.root);
        inorder(tree.root);
    }
}