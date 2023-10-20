package Tree;

import java.util.*;

class MaximumWidthOfBinaryTree{
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
    static class Pair {
        int pos;
        TreeNode node;

        Pair(int val, TreeNode root) {
            this.pos = val;
            this.node = root;
        }
    }

    static int findMaxWidth(TreeNode root){
        if(root==null) return 0;
        int res = 0; 
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, root));
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().pos;
            int first = 0, last = 0;
            for(int i=0;i<size;i++){
                int curr_pos = q.peek().pos - min;
                TreeNode currNode = q.poll().node;
                if(i==0) first = curr_pos;
                if(i==size-1) last = curr_pos;
                if(currNode.left!=null) q.offer(new Pair((curr_pos*2)+1, currNode.left));
                if(currNode.right!=null) q.offer(new Pair((curr_pos*2)+2, currNode.right));
            }
            res = Math.max(res, (last-first)+1);
        }
        return res;
    }
   public static void main(String[] args) {
    MaximumWidthOfBinaryTree treeCalculator = new MaximumWidthOfBinaryTree();
    
    // Creating a sample binary tree
    MaximumWidthOfBinaryTree.TreeNode root = treeCalculator.new TreeNode(1);
    root.left = treeCalculator.new TreeNode(2);
    root.right = treeCalculator.new TreeNode(3);
    root.left.left = treeCalculator.new TreeNode(4);
    root.left.right = treeCalculator.new TreeNode(5);
    
    // Calling the findMaxWidth method to find the maximum width of the tree
    int maxWidth = MaximumWidthOfBinaryTree.findMaxWidth(root);
    
    System.out.println("Maximum width of the binary tree: " + maxWidth);
    }
}



//         i
//       /   \                  0 based indexing 
// (2*i)+1   (2*i)+2 

//         i
//       /   \                  1 based indexing
//   (2*i)   (2*i)+1 