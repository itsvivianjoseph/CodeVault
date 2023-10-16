package Tree;

import java.util.*;

class TopView {
    public static class TreeNode {
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

    static ArrayList<Integer> topView(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, root));
        HashMap<Integer, Integer> hm = new HashMap<>();
        while (!q.isEmpty()) {
            Pair it = q.poll();
            if (!hm.containsKey(it.pos)) hm.put(it.pos, it.node.val);
            if (it.node.left != null) q.offer(new Pair((it.pos) - 1, it.node.left));
            if (it.node.right != null) q.offer(new Pair((it.pos) + 1, it.node.right));
        }
        
        List<Integer> sortedKeys = new ArrayList<>(hm.keySet());
        
        Collections.sort(sortedKeys);

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for (Integer key : sortedKeys) sortedMap.put(key, hm.get(key));

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) res.add(entry.getValue());
        
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ArrayList<Integer> result = topView(root);
        System.out.println("Top View of the Binary Tree:");
        for (Integer val : result) {
            System.out.print(val + " ");
        }
    }
}