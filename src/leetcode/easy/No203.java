package leetcode.easy;


/**
 * @author: liuyy
 * @date: 2020/7/7 15:00
 */
public class No203 {
    public static void main(String[] args) {
        No203 no203 = new No203();
        ListNode listNode = no203.new ListNode(1);
        listNode.next = no203.new ListNode(2);
        listNode.next.next = no203.new ListNode(6);
        listNode.next.next.next = no203.new ListNode(3);
        listNode.next.next.next.next = no203.new ListNode(4);
        listNode.next.next.next.next.next = no203.new ListNode(5);
        listNode.next.next.next.next.next.next = no203.new ListNode(6);

        ListNode node = no203.removeElements(listNode, 6);
        for (ListNode p = node; p != null; p = p.next) {
            System.out.println(p.val);
        }

    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode node = null;
        for (ListNode p = head; p != null; p = p.next) {
            if (p.val != val) {
                if (p == head) {
                    node = new ListNode(p.val);
                } else {
                    if (node == null) {
                        node = new ListNode(p.val);
                    } else {
                        setVal(node, p.val);
                    }
                }
            }
        }
        return node;
    }

    public void setVal(ListNode node, int val) {
        if (node.next != null) {
            setVal(node.next, val);
        } else {
            node.next = new ListNode(val);
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
