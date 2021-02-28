package com.company.LIst;

import java.util.ArrayList;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-19 22:50
 **/

//对于一个给定的链表，返回环的入口节点，如果没有环，返回null

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode current = head;
        ArrayList<ListNode> nodes = new ArrayList<>();
        do {
            if(nodes.contains(current)){
                break;
            }
            nodes.add(current);
            current = current.next;
        } while (current != null);
        return current;
    }
}
