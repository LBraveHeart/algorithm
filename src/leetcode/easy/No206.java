package leetcode.easy;

/**
 * @author: liuyy
 * @date: 2020/7/7 17:16
 */
public class No206 {
    public static void main(String[] args) {
        No206 no206 = new No206();
        ListNode listNode = no206.new ListNode(1);
        listNode.next = no206.new ListNode(2);
        listNode.next.next = no206.new ListNode(6);
        listNode.next.next.next = no206.new ListNode(3);
        listNode.next.next.next.next = no206.new ListNode(4);
        listNode.next.next.next.next.next = no206.new ListNode(5);
        listNode.next.next.next.next.next.next = no206.new ListNode(6);

        ListNode reverseList = no206.reverseList(listNode);
        for (ListNode p = reverseList; p != null; p = p.next) {
            System.out.print(p.val);
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode currTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currTemp;
        }
        return prev;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
