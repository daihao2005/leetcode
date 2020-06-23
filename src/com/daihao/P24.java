package com.daihao;

public class P24 {


    public static ListNode swapPairs(ListNode head) {
        ListNode p1 = new ListNode();
        p1.next = head;

        ListNode node = p1;
        while (node.next != null && node.next.next != null) {
            ListNode n1 = node.next;
            ListNode n2 = n1.next;
            node.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            node = n1;
        }
        return p1.next;
    }
}
