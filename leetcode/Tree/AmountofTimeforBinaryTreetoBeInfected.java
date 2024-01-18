package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AmountofTimeforBinaryTreetoBeInfected {
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

    private Map<TreeNode, List<TreeNode>> graph;
    
    public int amountOfTime(TreeNode root, int start) {
        graph = new HashMap<>();
        treeToGraph(root);

        return bfs(start);
    }

    private void treeToGraph(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (!graph.containsKey(current)) {
                graph.put(current, new ArrayList<>());
            }

            if (current.left != null) {
                graph.get(current).add(current.left);
                graph.putIfAbsent(current.left, new ArrayList<>(Arrays.asList(current)));
                queue.offer(current.left);
            }

            if (current.right != null) {
                graph.get(current).add(current.right);
                graph.putIfAbsent(current.right, new ArrayList<>(Arrays.asList(current)));
                queue.offer(current.right);
            }
        }
    }

    private int bfs(int start) {
        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(findNode(start));
        visited.add(findNode(start));

        int maxDistance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                for (TreeNode neighbor : graph.get(current)) {
                    if (!visited.contains(neighbor)) {
                        queue.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }

            maxDistance++;
        }

        return maxDistance - 1;
    }

    private TreeNode findNode(int target) {
        for (TreeNode node : graph.keySet()) {
            if (node.val == target) {
                return node;
            }
        }
        return null;
    }

}
