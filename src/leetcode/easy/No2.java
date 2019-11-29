package leetcode.easy;

/**
 * @author liuyy
 * @className No2
 * @description TODO
 * @date 2019/10/29 15:38
 **/
public class No2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int i1 = l1.next.next.val * 100 + l1.next.val * 10 + l1.val;
        int i2 = l2.next.next.val * 100 + l2.next.val * 10 + l2.val;

        String l3 = i1 + i2 + "";
        String[] split = l3.split("");
        ListNode l = null;
        for (int i = split.length - 1; i >= 0; i--) {
            System.out.println(split[i]);
            if (l == null) {
                l = new ListNode(Integer.parseInt(split[i]));
            }else if (l.next == null){
                l.next = new ListNode(Integer.parseInt(split[i]));
            }else {
                l.next.next = new ListNode(Integer.parseInt(split[i]));
            }
        }
        return l;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


