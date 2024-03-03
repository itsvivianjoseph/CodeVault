package Tree;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPaths {
    public static void main(String[] args) {
        
        RootToLeafPaths.TreeNode root = new RootToLeafPaths.TreeNode(1);
        root.left = new RootToLeafPaths.TreeNode(2);
        root.right = new RootToLeafPaths.TreeNode(3);
        // root.left.left = new RootToLeafPaths.TreeNode(4);
        root.left.right = new RootToLeafPaths.TreeNode(5);
        // root.right.left = new RootToLeafPaths.TreeNode(6);
        // root.right.right = new RootToLeafPaths.TreeNode(7);

        List<String> res = binaryTreePaths(root);
        for (String string : res) {
            System.out.println(string);
        }
        StringBuilder str = new StringBuilder();
        str.append(7);
        System.out.println(str);
    }
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
    static List<String> list;
    static List<String> binaryTreePaths(TreeNode root) {
        list = new ArrayList<>();
        if(root == null) return list;
        DFS(root,"");
        return list;
    }
    static void DFS(TreeNode root,String curr){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(curr +  Integer.toString(root.val));
            return; 
        }
        DFS(root.left, curr + Integer.toString(root.val) + "->");
        DFS(root.right, curr + Integer.toString(root.val) + "->");
    }
}