import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
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

    // Removed static keyword
    boolean BFS(TreeNode root, int key) {
        if (root == null) return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.val == key) return true;
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Create an instance of BreadthFirstSearch to use non-static methods
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        
        // Example usage: create a sample tree and check if a key exists
        TreeNode root = bfs.new TreeNode(1);
        root.left = bfs.new TreeNode(2);
        root.right = bfs.new TreeNode(3);
        root.left.left = bfs.new TreeNode(4);
        root.left.right = bfs.new TreeNode(5);

        int keyToFind = 10;
        boolean found = bfs.BFS(root, keyToFind);
        System.out.println("Key " + keyToFind + " found: " + found);
    }
}
