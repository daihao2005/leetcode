package com.daihao;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode build(int... nums) {
        ListNode p = new ListNode();
        ListNode p1 = p;
        for (Integer num : nums) {
            p1.next = new ListNode(num);
            p1 = p1.next;
        }
        return p.next;
    }

    public static void print(ListNode node) {
        if (node == null) {
            System.out.print("null");
            return;
        }
        System.out.print(node.val + ",");
        print(node.next);
    }
}