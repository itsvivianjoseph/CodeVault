package Tree;

public class CountNodesEqualAverageofSubtree {
    static class TreeNode {
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
    public int averageOfSubtree(TreeNode root) {
        int[] result = new int[1];
        traverse(root,result);
        return result[0];
    }
    static int[] traverse(TreeNode root,int[] result){
        if(root==null) return new int[] {0,0};

        int[] left = traverse(root.left,result);
        int[] right = traverse(root.right,result);

        int currSum = root.val + left[0] + right[0];
        int currCount = 1 + left[1] + right[1];

        if(currSum / currCount == root.val) result[0]++;

        return new int[] {currSum , currCount};
    }
}
