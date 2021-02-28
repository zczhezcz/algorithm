package com.company.LIst;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-20 21:00
 **/

public class AddInList {

    public ListNode addInList(ListNode head1, ListNode head2) {
        int list1Int = 0;
        int list2Int = 0;
        for (int i = 0; ; i++) {
            list1Int = list1Int * 10 + head1.val;
            head1 = head1.next;
            if (head1 == null) {
                break;
            }
        }
        System.out.println("list1Int = " + list1Int);

        for (int i = 0; ; i++) {
            list2Int = list2Int * 10 + head2.val;
            head2 = head2.next;
            if (head2 == null) {
                break;
            }
        }

        System.out.println("list2Int = " + list2Int);

        int intResult = list1Int + list2Int;
        ListNode lastNode = null;
        do{
            int val = intResult %10;
            intResult = intResult /10;
            ListNode node = new ListNode(val);
            node.next = lastNode;
            lastNode = node;
        }while (intResult != 0);
        return null;
    }
}
