package com.company.LIst;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-19 20:59
 **/

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static void print(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ListNode remove(ListNode last, ListNode current, ListNode headNode) {
        if (last == null) {
            headNode = current.next;
        } else {
            last.next = current.next;
        }
        return headNode;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next;
        ListNode current = head;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
}

