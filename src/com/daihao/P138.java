package com.daihao;

import java.util.HashMap;
import java.util.Map;

public class P138 {

    public static void main(String[] args) {
        Node n0 = new Node(7);
        Node n1 = new Node(13);
        n0.random = null;
        n1.random = n0;
        n0.next = n1;
        Node node = copyRandomList(n0);
    }

    public static Node copyRandomList(Node head) {

        Node n = head;
        Node tmpHead = new Node(0);
        Node tmp = tmpHead;
        Map<Node, Node> map = new HashMap<>();
        while (n != null) {
            Node newNode = new Node(n.val);
            newNode.random = n.random;
            map.put(n, newNode);
            tmp.next = newNode;
            tmp = tmp.next;
            n = n.next;
        }
        tmp = tmpHead.next;
        while (tmp != null) {
            if (tmp.random != null) {
                tmp.random = map.get(tmp.random);
            }
            tmp = tmp.next;
        }
        return tmpHead.next;
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
