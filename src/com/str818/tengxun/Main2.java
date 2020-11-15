package com.str818.tengxun;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Node root = null, last = null;
        if (n > 0) {
            root = new Node(in.nextInt());
            last = root;
        }
        for (int i = 1; i < n; i++) {
            Node cur = new Node(in.nextInt());
            last.setNext(cur);
            last = cur;
        }

        Node cur = root;
        if (cur == null) return;
        if (cur.val == k) {
            root = cur.next;
        } else {
            while (cur.next != null) {
                if (cur.val == k) {
                    cur.val = cur.next.val;
                    cur.next = cur.next.next;
                    break;
                }
                cur = cur.next;
            }
        }
        cur = root;
        StringBuilder ans = new StringBuilder();
        while (cur != null) {
            ans.append(cur.val).append(" ");
            cur = cur.next;
        }
        System.out.print(ans.toString().trim());
    }
}

class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
