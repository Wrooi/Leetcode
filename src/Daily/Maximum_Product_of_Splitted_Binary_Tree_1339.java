package Daily;


import javax.swing.tree.TreeNode;

public class Maximum_Product_of_Splitted_Binary_Tree_1339 {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Maximum_Product_of_Splitted_Binary_Tree_1339.TreeNode left, Maximum_Product_of_Splitted_Binary_Tree_1339.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        static long totalSum;
        static long maxProduct;
        static final int MOD = 1_000_000_007;

        public int maxProduct(TreeNode root) {
            maxProduct = 0;
            totalSum = dfs(root);
            dfsMaxProduct(root);
            return (int) (maxProduct % MOD);
        }

        private long dfs(TreeNode node) {
            if (node == null) return 0;
            return node.val + dfs(node.left) + dfs(node.right);
        }

        private long dfsMaxProduct(TreeNode node) {
            if (node == null) return 0;

            long left = dfsMaxProduct(node.left);
            long right = dfsMaxProduct(node.right);

            long subtreeSum = node.val + left + right;
            maxProduct = Math.max(maxProduct, subtreeSum * (totalSum - subtreeSum));

            return subtreeSum;
        }
    }

    public static void main(String[] args) {

    }
}
