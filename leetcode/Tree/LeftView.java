package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
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

    static ArrayList<Integer> leftView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair it = q.poll();
            if (it.pos == res.size()) res.add(it.node.val);
            if (it.node.left != null) q.offer(new Pair(it.pos + 1, it.node.left));
            if (it.node.right != null) q.offer(new Pair(it.pos + 1, it.node.right));
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ArrayList<Integer> result = leftView(root);
        System.out.println("Left View of the Binary Tree:");
        for (Integer val : result) {
            System.out.print(val + " ");
        }
    }
}
