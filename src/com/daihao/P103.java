package com.daihao;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P103 {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.add(root);
        boolean fromLeft = true;
        while (!stack.isEmpty()) {
            Deque<TreeNode> tmpStack = new ArrayDeque<>();
            List<Integer> tmp = new ArrayList<>();
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                tmp.add(node.val);
                if (fromLeft) {
                    if (node.left != null) {
                        tmpStack.push(node.left);
                    }
                    if (node.right != null) {
                        tmpStack.push(node.right);
                    }
                } else {
                    if (node.right != null) {
                        tmpStack.push(node.right);
                    }
                    if (node.left != null) {
                        tmpStack.push(node.left);
                    }
                }
            }
            stack = tmpStack;
            res.add(tmp);
            fromLeft = !fromLeft;
        }
        return res;
    }
}
