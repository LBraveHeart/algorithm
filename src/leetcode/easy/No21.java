package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyy
 * @className No21
 * @description 合并两个有序链表
 * @date 2019/10/30 14:58
 **/
public class No21 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(1);

        No21 no21 = new No21();
        ListNode listNode = no21.mergeTwoLists(null, l2);

        System.out.println(listNode);


    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        List<Integer> integers = new ArrayList<>();
        getAllData(l1, integers);
        getAllData(l2, integers);
        integers.sort(Integer::compareTo);
        ListNode next = null;
        for (int i = 0; i < integers.size(); i++) {
            if (i == 0) {
                listNode = new ListNode(integers.get(i));
                next = listNode;
            }else {
                next = mergeListNode(next, integers.get(i));
            }
        }
        if (integers.size() == 0) {
            return null;
        }

        return listNode;
    }

    public void getAllData(ListNode listNode, List<Integer> integers) {
        if (listNode != null) {
            integers.add(listNode.val);
            getAllData(listNode.next, integers);
        }
    }

    public ListNode mergeListNode(ListNode listNode, Integer val) {
        listNode.next = new ListNode(val);
        return listNode.next;
    }



    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}
