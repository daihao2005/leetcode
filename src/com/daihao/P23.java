package com.daihao;

public class P23 {


    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode head = new ListNode();
        ListNode node = head;
        while (true) {
            ListNode minNode = null;
            int minI = -1;
            for (int i = 0; i < lists.length; i++) {
                ListNode n = lists[i];
                if (n == null) {
                    continue;
                }
                if (minNode == null) {
                    minNode = n;
                    minI = i;
                } else {
                    if (minNode.val <= n.val) {
                        continue;
                    }
                    minNode = n;
                    minI = i;
                }
            }
            if (minNode == null) {
                break;
            } else {
                node.next = minNode;
                lists[minI] = minNode.next;
                node = node.next;
            }
        }
        return head.next;
    }
}
