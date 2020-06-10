package com.daihao;

public class P19 {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode node = head;
        ListNode preN = null;
        int idx = 0;
        while (node.next != null) {

            node = node.next;
            if (preN == null) {
                if (idx < n - 1) {
                    idx++;
                } else {
                    preN = head;
                }

            } else {
                preN = preN.next;
            }
        }
        if (preN == null) {
            return head.next;
        } else {
            preN.next = preN.next.next;
            return head;
        }


    }
}
