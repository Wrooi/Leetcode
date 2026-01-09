package Daily;
import java.util.*;

public class Smallest_Subtree_with_all_the_Deepest_Nodes_865 {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        Maximum_Product_of_Splitted_Binary_Tree_1339.TreeNode left;
        Maximum_Product_of_Splitted_Binary_Tree_1339.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Maximum_Product_of_Splitted_Binary_Tree_1339.TreeNode left, Maximum_Product_of_Splitted_Binary_Tree_1339.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public TreeNode subtreeWithAllDeepest(TreeNode root) {
            if (root == null) return null;

            Map<TreeNode, TreeNode> parent = new HashMap<>();
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            parent.put(root, null);

            List<TreeNode> lastLevel = new ArrayList<>();

            // BFS traversal
            while (!q.isEmpty()) {
                int size = q.size();
                lastLevel.clear();

                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();
                    lastLevel.add(node);

                    if (node.left != null) {
                        parent.put(node.left, node);
                        q.offer(node.left);
                    }
                    if (node.right != null) {
                        parent.put(node.right, node);
                        q.offer(node.right);
                    }
                }
            }

            Set<TreeNode> deepest = new HashSet<>(lastLevel);

            // Move upward until all nodes converge
            while (deepest.size() > 1) {
                Set<TreeNode> next = new HashSet<>();
                for (TreeNode node : deepest) {
                    next.add(parent.get(node));
                }
                deepest = next;
            }

            return deepest.iterator().next();
        }
    }

    public static void main(String[] args) {

    }
}
