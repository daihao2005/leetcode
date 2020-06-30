package com.daihao;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class P102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while (list.size() > 0) {
            List<Integer> tmpResult = new ArrayList<>();
            List<TreeNode> tmpList = new ArrayList<>();
            for (TreeNode node : list) {
                tmpResult.add(node.val);
                if (node.left != null) {
                    tmpList.add(node.left);
                }
                if (node.right != null) {
                    tmpList.add(node.right);
                }
            }
            res.add(tmpResult);
            list = tmpList;
        }
        return res;
    }
}
