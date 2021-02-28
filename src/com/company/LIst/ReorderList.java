package com.company.LIst;

import java.util.ArrayList;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-20 18:48
 **/
/*
将给定的单链表 L： L_0→L_1→…→L_{n-1}→L_ nL
重新排序为：L_0→L_n →L_1→L_{n-1}→L_2→L_{n-2}→…L
要求使用原地算法，不能改变节点内部的值，需要对实际的节点进行交换。
例：对于给定的单链表{10,20,30,40}，将其重新排序为{10,40,20,30}.
 **/
public class ReorderList {
    public ListNode reorderList(ListNode head) {
        ListNode current = head;
        ArrayList<ListNode> nodes = new ArrayList<>();
        do {
            nodes.add(current);
            current = current.next;
        } while (current != null);

        for (int i = 0, j = nodes.size() - 1, k = 0; k < nodes.size(); k++) {
            System.out.print("i = " + i);
            if (k % 2 == 0) {
                current = nodes.get(i);
                current.next = nodes.get(j);
                i++;
            } else {
                current = nodes.get(j);
                current.next = nodes.get(i);
                j--;
            }
            System.out.println(" : current.val = " + current.val);

        }
        nodes.get(nodes.size() / 2).next = null;

        return head;
    }
}
