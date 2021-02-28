package com.company.LIst;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-19 14:50
 **/
/*
给出一个升序排序的链表，删除链表中的所有重复出现的元素，只保留原链表中只出现一次的元素。
例如：
给出的链表为：1→2→3→3→4→4→5, 返回1→2→5.
给出的链表为 1→1→1→2→3,2→3
 **/
public class DeleteDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        List<Integer> listVals = new ArrayList<>();
        List<Integer> dupVals = new ArrayList<>();

        do {
            if (listVals.contains(current.val)) {
                dupVals.add(current.val);
            }
            listVals.add(current.val);
            current = current.next;
        }
        while (current != null);

        // System.out.println("dupVals = " + dupVals);

        current = head;
        ListNode lastNode = null;
        do {
            //System.out.println("-------" + current.val + "---------");
            if (dupVals.contains(current.val)) {
                head = ListNode.remove(lastNode, current, head);
            } else {
                lastNode = current;
            }
            current = current.next;

            //ListNode.print(head);
        }
        while (current != null);
        return head;
    }


}
