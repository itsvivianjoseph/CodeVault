import java.util.Stack;

public class DepthFirstSearch {
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

    static boolean DFS(TreeNode root,int key){
        if(root == null) return false;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            System.out.println(curr.val);
            if(curr.val == key) return true; 
            if(curr.left != null) stack.push(curr.left);
            if(curr.right != null) stack.push(curr.right);
        }

        return false;
    }

    public static void main(String[] args) {
        // Create an instance of BreadthFirstSearch to use non-static methods
        DepthFirstSearch dfs = new DepthFirstSearch();

        // Example usage: create a sample tree and check if a key exists
        TreeNode root = dfs.new TreeNode(1);
        root.left = dfs.new TreeNode(2);
        root.right = dfs.new TreeNode(3);
        root.left.left = dfs.new TreeNode(4);
        root.left.right = dfs.new TreeNode(5);
     
        System.out.println(DFS(root, 6));
    }
}