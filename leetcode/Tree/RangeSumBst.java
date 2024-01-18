package Tree;

public class RangeSumBst {
    static class TreeNode {
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

    int sum = 0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        calcSum(root, low, high);
        return sum;
    }

    private void calcSum(TreeNode root, int low, int high) {
        if (root != null) {
            calcSum(root.left, low, high);
            if (low <= root.val && root.val <= high) sum += root.val;
            calcSum(root.right, low, high);
        }
    }
}
