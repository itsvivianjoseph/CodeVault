package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeinBinarySearchTree {
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

    HashMap<Integer, Integer> res = new HashMap<>();
    int maxFrequency = 0;

    public int[] findMode(TreeNode root) {
        inOrder(root);

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }

        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }

        return result;
    }

    void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            res.put(root.val, res.getOrDefault(root.val, 0) + 1);
            maxFrequency = Math.max(maxFrequency, res.get(root.val));
            inOrder(root.right);
        }
    }

}
