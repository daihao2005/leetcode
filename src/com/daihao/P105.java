package com.daihao;

public class P105 {

    public static void main(String[] args) {
        int[] preorder = {3, 9, 10, 12, 11, 20, 15, 7};
        int[] inorder = {12, 10, 9, 11, 3, 15, 20, 7};
        TreeNode tree = buildTree1(preorder, inorder);
        TreeNode.show(tree);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        //return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return null;
    }

    public static TreeNode buildTree(int[] preorder, int pLeft, int pRight, int[] inorder, int iLeft, int iRight) {
        if (pLeft > pRight || iLeft > iRight) {
            return null;
        }
        int i = iLeft;
        for (i = iLeft; i <= iRight; i++) {
            if (preorder[pLeft] == inorder[i]) {
                break;
            }
        }
        TreeNode cur = new TreeNode(preorder[pLeft]);
        cur.left = buildTree(preorder, pLeft + 1, pLeft + i - iLeft, inorder, iLeft, i - 1);
        cur.right = buildTree(preorder, pLeft + i - iLeft + 1, pRight, inorder, i + 1, iRight);
        return cur;
    }

    public static TreeNode buildTree1(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[0]);
        int i;
        for (i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                break;
            }
        }

        int[] leftPreorder = subArray(preorder, 1, i);
        int[] rightPreorder = subArray(preorder, i + 1, preorder.length - 1);
        int[] leftInorder = subArray(inorder, 0, i - 1);
        int[] rightInorder = subArray(inorder, i + 1, inorder.length - 1);
        node.left = buildTree1(leftPreorder, leftInorder);
        node.right = buildTree1(rightPreorder, rightInorder);
        return node;
    }

    private static int[] subArray(int[] array, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return null;
        }
        int[] result = new int[endIndex - startIndex + 1];
        for (int i = startIndex; i <= endIndex; i++) {
            result[i - startIndex] = array[i];
        }
        return result;
    }


}
