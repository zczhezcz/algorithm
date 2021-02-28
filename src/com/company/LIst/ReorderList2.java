package com.company.LIst;

import java.util.ArrayList;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-20 18:48
 **/
/*
将给定的单链表 L： 1→2→3→4→5→6
重新排序为：2→1→4→3→6→5
要求使用原地算法，不能改变节点内部的值，需要对实际的节点进行交换。
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while(temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }
}

作者：guanpengchn
链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs/solution/hua-jie-suan-fa-24-liang-liang-jiao-huan-lian-biao/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 **/
public class ReorderList2 {
    public ListNode reorderList(ListNode head) {
        ListNode pre = head;
        ListNode next = pre.next;
        head = next;
        while (pre != null && pre.next != null) {

            next.next = pre;

            System.out.println("curVal = " + pre.val + " curNext = " + pre.next.val);
        }
        return head;
    }
}
