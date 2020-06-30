package com.daihao;

public class P112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        int nextSum = sum - root.val;
        return hasPathSum(root.left, nextSum) || hasPathSum(root.right, nextSum);
    }
}
