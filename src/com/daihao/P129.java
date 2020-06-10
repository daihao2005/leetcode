package com.daihao;

public class P129 {

    public static void main(String[] args) {

    }

    public static int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return build(root, 0);

    }

    public static int build(TreeNode node, int pVal) {

        if (node.left == null && node.right == null) {
            return pVal * 10 + node.val;
        }
        int sum = 0;
        if (node.left != null) {
            sum += build(node.left, pVal * 10 + node.val);
        }
        if (node.right != null) {
            sum += build(node.right, pVal * 10 + node.val);
        }
        return sum;

    }


}
