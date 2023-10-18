package Tree;

import java.util.ArrayList;
import java.util.List;

public class RootToNodePath {
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
    static boolean getPath(TreeNode root,List<Integer> res,int x){
        if(root==null) return false;
        res.add(root.val);
        if(root.val==x) return true;
        if(getPath(root.left, res, x) || getPath(root.right, res, x)) return true;
        res.remove(res.size()-1);
        return false;
    }
    static List<Integer> pathFromRootToNode(TreeNode root,int x){
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null) return res;
        getPath(root, res, x);
        return res;
    }
    public static void main(String[] args) {

        RootToNodePath.TreeNode root = new RootToNodePath.TreeNode(1);
        root.left = new RootToNodePath.TreeNode(2);
        root.right = new RootToNodePath.TreeNode(3);
        root.left.left = new RootToNodePath.TreeNode(4);
        root.left.right = new RootToNodePath.TreeNode(5);
        root.right.left = new RootToNodePath.TreeNode(6);
        root.right.right = new RootToNodePath.TreeNode(7);

        int target = 5;
        List<Integer> path = RootToNodePath.pathFromRootToNode(root, target);

        if (!path.isEmpty()) {
            System.out.print("Path from root to node " + target + ": ");
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i));
                if (i < path.size() - 1) {
                    System.out.print(" -> ");
                }
            }
        } else {
            System.out.println("Node " + target + " not found in the tree.");
        }
    }
}
