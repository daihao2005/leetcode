package com.daihao;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = isSum(root, sum, new ArrayList<>());
        if (list == null) {
            return new ArrayList<>();
        }
        return list;
    }

    public List<List<Integer>> isSum(TreeNode root, int sum, List<Integer> parentList) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            if (root.val == sum) {
                List<Integer> curList = new ArrayList<>(parentList.size() + 1);
                curList.addAll(parentList);
                curList.add(root.val);
                List<List<Integer>> result = new ArrayList<>();
                result.add(curList);
                return result;
            } else {
                return null;
            }
        } else {
            List<Integer> curList = new ArrayList<>(parentList.size() + 1);
            curList.addAll(parentList);
            curList.add(root.val);
            List<List<Integer>> leftResult = isSum(root.left, sum - root.val, curList);
            List<List<Integer>> rightResult = isSum(root.right, sum - root.val, curList);
            if (leftResult == null && rightResult == null) {
                return null;
            }
            if (leftResult != null && rightResult != null) {
                leftResult.addAll(rightResult);
                return leftResult;
            }
            if (leftResult != null) {
                return leftResult;
            }
            return rightResult;

        }

    }
}
