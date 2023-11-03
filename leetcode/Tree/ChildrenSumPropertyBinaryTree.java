package Tree;

class ChildrenSumPropertyBinaryTree{
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
    // striver sol
    // tc : O(N)
    // sc : O(H)
    static void changeTree(TreeNode root){
        if(root==null) return;
        int child = 0;
        if(root.left!=null) child+=root.left.val;
        if(root.right!=null) child+=root.right.val;
        if(root.val <= child) root.val = child;
        else {
            if(root.left!=null) root.left.val = child;
            if(root.right!=null) root.right.val = child; 
        }
        changeTree(root.left);
        changeTree(root.right);
        int tot = 0;
        if(root.left!=null) tot += root.left.val;
        if(root.right!=null) tot += root.right.val;
        if(root.left!=null || root.right!=null) root.val = tot;
    }
}
// alternate gpt sol
// static void changeTree(TreeNode root) {
//     if (root == null) {
//         return;
//     }

//     if (root.left != null || root.right != null) {
//         int childSum = 0;
//         if (root.left != null) {
//             childSum += root.left.val;
//         }
//         if (root.right != null) {
//             childSum += root.right.val;
//         }

//         int diff = childSum - root.val;

//         if (diff > 0) {
//             root.val += diff;
//         } else if (diff < 0) {
//             // Distribute the deficit to children, prioritizing the left child
//             if (root.left != null) {
//                 root.left.val += diff;
//             } else {
//                 root.right.val += diff;
//             }
//         }
//     }

//     changeTree(root.left);
//     changeTree(root.right);
// }