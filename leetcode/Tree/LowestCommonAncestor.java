package Tree;

public class LowestCommonAncestor {
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

    static class Pair {
        int pos;
        TreeNode node;

        Pair(int val, TreeNode root) {
            this.pos = val;
            this.node = root;
        }
    }
    static TreeNode LCA(TreeNode root,TreeNode p,TreeNode q){
        if(root==null || root==p || root==q) return root;
        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);
        if(left==null) return right;
        else if(right==null) return left;
        else return root;
    }
    public static void main(String[] args) {
        // Create a sample binary tree
        LowestCommonAncestor.TreeNode root = new LowestCommonAncestor.TreeNode(3);
        root.left = new LowestCommonAncestor.TreeNode(5);
        root.right = new LowestCommonAncestor.TreeNode(1);
        root.left.left = new LowestCommonAncestor.TreeNode(6);
        root.left.right = new LowestCommonAncestor.TreeNode(2);
        root.right.left = new LowestCommonAncestor.TreeNode(0);
        root.right.right = new LowestCommonAncestor.TreeNode(8);
        root.left.right.left = new LowestCommonAncestor.TreeNode(7);
        root.left.right.right = new LowestCommonAncestor.TreeNode(4);

        // Define the nodes for which you want to find the Lowest Common Ancestor (LCA)
        LowestCommonAncestor.TreeNode p = root.left; // Node with value 5
        LowestCommonAncestor.TreeNode q = root.right; // Node with value 1

        // Call the LCA method to find the LCA of nodes p and q
        LowestCommonAncestor.TreeNode lca = LowestCommonAncestor.LCA(root, p, q);

        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + lca.val);
        } else {
            System.out.println("Lowest Common Ancestor not found.");
        }
    }   
}