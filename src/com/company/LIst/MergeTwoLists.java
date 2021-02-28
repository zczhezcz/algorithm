package com.company.LIst;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-19 21:24
 **/

/*
    将两个有序的链表合并为一个新链表，要求新的链表是通过拼接两个链表的节点来生成的，且合并后新链表依然有序。
*/
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        ListNode l1IndexNode = l1;
        ListNode l2IndexNode = l2;
        do {
            if (l1IndexNode.val <= l2IndexNode.val) {
                if (head == null) {
                    head = l1IndexNode;
                } else {
                    current.next = l1IndexNode;
                }
                current = l1IndexNode;
                l1IndexNode = l1IndexNode.next;
            } else {

                if (head == null) {
                    head = l2IndexNode;
                } else {
                    current.next = l2IndexNode;
                }
                current = l2IndexNode;
                l2IndexNode = l2IndexNode.next;
            }

        }
        while (l1IndexNode != null && l2IndexNode != null);

        if (l1IndexNode == null) {
            do {
                current.next = l2IndexNode;
                l2IndexNode = l2IndexNode.next;
            } while (l2IndexNode != null);
        } else {
            do {
                current.next = l1IndexNode;
                l1IndexNode = l1IndexNode.next;
            } while (l1IndexNode != null);
        }
        return head;
    }
}
