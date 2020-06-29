package com.daihao;

public class P98 {

    public static void main(String[] args) {
        TreeNode root = TreeNode.build(5, 1, 4, null, null, 3, 6);
        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return validate(root, null, null);
    }

    private static boolean validate(TreeNode node, Integer min, Integer max) {
        if (max != null && node.val >= max) {
            return false;
        }

        if (min != null && node.val <= min) {
            return false;
        }

        if (node.left != null) {
            boolean result = validate(node.left, min, max == null ? node.val : Math.min(node.val, max));
            if (!result) {
                return false;
            }
        }
        if (node.right != null) {
            boolean result = validate(node.right, min == null ? node.val : Math.max(node.val, min), max);
            if (!result) {
                return false;
            }
        }
        return true;
    }
}
