package com.daihao;

public class P21 {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode nl = new ListNode();
        ListNode n = nl;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                n.next = l2;
                break;
            }
            if (l2 == null) {
                n.next = l1;
                break;
            }
            if (l1.val <= l2.val) {
                n.next = l1;
                n = n.next;
                l1 = l1.next;
            } else {
                n.next = l2;
                n = n.next;
                l2 = l2.next;
            }
        }
        return nl.next;
    }
}
