package com.daihao;

/**
 * @author gang
 */
public class P25 {


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode node = reverseKGroup(n1, 2);
    }

    private static ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1) {
            return head;
        }
        ListNode top = new ListNode();
        top.next = head;
        ListNode n = top;
        while (true) {
            ListNode[] array = new ListNode[k];
            boolean isBreak = false;
            ListNode tmp = n.next;
            for (int i = 0; i < k; i++) {
                if (tmp == null) {
                    isBreak = true;
                    break;
                }
                array[i] = tmp;
                tmp = tmp.next;
            }
            if (isBreak) {
                break;
            }
            ListNode next = array[k - 1].next;
            ListNode tmp1 = n;
            for (int i = k - 1; i >= 0; i--) {
                tmp1.next = array[i];
                tmp1 = array[i];
            }
            tmp1.next = next;
            n = tmp1;
        }
        return top.next;
    }




}
