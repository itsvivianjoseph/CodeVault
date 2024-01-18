package Tree;

public class MaximumDifferenceBetweenNodeandAncestor {
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

    static int DFS(TreeNode current, int max, int min){
        if(current == null) return max-min;

        max = Math.max(max, current.val);
        min = Math.min(min, current.val);

        int left = DFS(current.left, max, min);
        int right = DFS(current.right, max, min);

        return Math.max(left, right);
    }
    public int maxAncestorDiff(TreeNode root) {
        return DFS(root, root.val, root.val);
    }
}
