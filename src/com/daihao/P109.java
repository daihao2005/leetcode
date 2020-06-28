package com.daihao;

public class P109 {

    public static void main(String[] args) {
        ListNode lisNode = ListNode.build(1,2,3,4,5,6,7,8,9,0);
        TreeNode treeNode = sortedListToBST(lisNode);
        TreeNode.show(treeNode);
    }

    public static TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;
        ListNode prePtr = null;
        while (fastPtr != null && fastPtr.next != null) {
            prePtr = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        TreeNode node = new TreeNode(slowPtr.val);
        prePtr.next = null;
        node.left = sortedListToBST(head);
        node.right = sortedListToBST(slowPtr.next);
        return node;
    }


}
