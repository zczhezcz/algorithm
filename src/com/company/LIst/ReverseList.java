package com.company.LIst;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-19 22:21
 **/

public class ReverseList {

    public ListNode reverseList(ListNode node1) {

        ListNode current = node1;
        ListNode pre = null;
        ListNode next;
        do {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;

        } while (current != null);
        return pre;
    }
}
