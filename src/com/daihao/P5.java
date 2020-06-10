package com.daihao;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class P5 {
    public static void main(String[] args) {

        String s = "abcdba";
        String s1 = longestPalindrome(s);
        System.out.println(s1);
    }

    public static String longestPalindrome(String s) {
        if (s == null || "".equals(s)) {
            return "";
        }
        int i = 0, j = s.length() - 1;
        int maxLength = 0;
        int maxIndex = 0;
        while (i < s.length()) {
            int k = 0;
            boolean success = false;
            while (i + k <= j - k) {
                if (s.charAt(i + k) == s.charAt(j - k)) {

                    if (i + k == j - k) {
                        int length = k * 2 + 1;
                        if (maxLength < length) {
                            maxLength = length;
                            maxIndex = i;
                            success = true;
                        }
                        break;
                    } else if (i + k == j - k - 1) {
                        int length = k * 2 + 2;
                        if (maxLength < length) {
                            maxLength = length;
                            maxIndex = i;
                            success = true;
                        }
                        break;
                    } else {
                        k++;
                    }
                } else {
                    break;
                }
            }
            if (i < j - 1 && !success) {
                j--;
            } else {
                if (i == s.length() - 1) {
                    break;
                }
                i++;
                j = s.length() - 1;
            }
        }
        if (maxLength == 0) {
            return s.charAt(0) + "";
        }
        return s.substring(maxIndex, maxIndex + maxLength);
    }
}
