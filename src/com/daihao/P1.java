package com.daihao;

import java.util.HashMap;

/**
 * completed
 */
public class P1 {
    public static void main(String[] args) {

        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        for (int i : ints) {
            System.out.print(i);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub)) {
                return new int[]{map.get(sub), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
