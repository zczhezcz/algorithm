package com.company.LIst;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-19 21:01
 **/

public class MainClass {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        ListNode nodea = new ListNode(5);
        ListNode nodeb = new ListNode(6);
        ListNode nodec = new ListNode(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        nodea.next = nodeb;
        nodeb.next = nodec;
        nodec.next = null;

        ListNode head = new ReorderList2().reorderList(node1);
        ListNode.print(head);

    }
}
