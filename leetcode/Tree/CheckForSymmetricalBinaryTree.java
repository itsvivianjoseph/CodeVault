package Tree;

class CheckForSymmetricalBinaryTree{
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

    static class Pair {
        int pos;
        TreeNode node;

        Pair(int val, TreeNode root) {
            this.pos = val;
            this.node = root;
        }
    }

    static boolean isSymmetrical(TreeNode root){
        return root==null || isSymmetricalHelper(root.left,root.right);
    }

    static boolean isSymmetricalHelper(TreeNode left,TreeNode right){
        if(left==null || right==null) return left==right;
        if(left.val!=right.val) return false;
        return isSymmetricalHelper(left.left, right.right) && isSymmetricalHelper(left.right, right.left);
    }
    public static void main(String[] args) {
        // Create a symmetric binary tree
        CheckForSymmetricalBinaryTree.TreeNode symmetricTree = new CheckForSymmetricalBinaryTree.TreeNode(1);
        symmetricTree.left = new CheckForSymmetricalBinaryTree.TreeNode(2);
        symmetricTree.right = new CheckForSymmetricalBinaryTree.TreeNode(2);
        symmetricTree.left.left = new CheckForSymmetricalBinaryTree.TreeNode(3);
        symmetricTree.left.right = new CheckForSymmetricalBinaryTree.TreeNode(4);
        symmetricTree.right.left = new CheckForSymmetricalBinaryTree.TreeNode(4);
        symmetricTree.right.right = new CheckForSymmetricalBinaryTree.TreeNode(3);

        boolean isSymmetric = CheckForSymmetricalBinaryTree.isSymmetrical(symmetricTree);
        System.out.println("Is the tree symmetric? " + isSymmetric); // It should print "true"

        // Create a non-symmetric binary tree
        CheckForSymmetricalBinaryTree.TreeNode nonSymmetricTree = new CheckForSymmetricalBinaryTree.TreeNode(1);
        nonSymmetricTree.left = new CheckForSymmetricalBinaryTree.TreeNode(2);
        nonSymmetricTree.right = new CheckForSymmetricalBinaryTree.TreeNode(2);
        nonSymmetricTree.left.right = new CheckForSymmetricalBinaryTree.TreeNode(3);
        nonSymmetricTree.right.right = new CheckForSymmetricalBinaryTree.TreeNode(3);

        isSymmetric = CheckForSymmetricalBinaryTree.isSymmetrical(nonSymmetricTree);
        System.out.println("Is the tree symmetric? " + isSymmetric); // It should print "false"
    }

}