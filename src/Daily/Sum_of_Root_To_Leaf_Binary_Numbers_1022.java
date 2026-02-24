package Daily;

public class Sum_of_Root_To_Leaf_Binary_Numbers_1022 {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        Sum_of_Root_To_Leaf_Binary_Numbers_1022.TreeNode left;
        Sum_of_Root_To_Leaf_Binary_Numbers_1022.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Sum_of_Root_To_Leaf_Binary_Numbers_1022.TreeNode left, Sum_of_Root_To_Leaf_Binary_Numbers_1022.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {

        public int sumRootToLeaf(TreeNode root) {
            return dfs(root, 0);
        }

        private int dfs(TreeNode node, int current) {
            if (node == null) {
                return 0;
            }

            current = current * 2 + node.val;

            if (node.left == null && node.right == null) {
                return current;
            }

            return dfs(node.left, current) + dfs(node.right, current);
        }
    }

    public static void main(String[] args) {

    }
}
