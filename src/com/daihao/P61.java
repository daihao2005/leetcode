package com.daihao;

public class P61 {

    public static void main(String[] args) {
        ListNode head = ListNode.build(new int[]{0, 1, 2});
        ListNode node = rotateRight(head, 4);
        ListNode.print(node);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int length = 0;
        ListNode n = head;
        ListNode end = null;
        while (n != null) {
            length++;
            if (n.next == null) {
                end = n;
            }
            n = n.next;
        }
        int mod = k % length;
        if (mod == 0) {
            return head;
        }
        int idx = length - mod;
        ListNode result = head;
        while (idx > 0) {
            if (idx == 1) {
                ListNode newEnd = result;
                result = result.next;
                newEnd.next = null;
            } else {
                result = result.next;
            }

            idx--;
        }

        end.next = head;
        return result;

    }
}
