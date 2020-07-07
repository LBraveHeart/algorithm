package leetcode.easy.step2;

/**
 * @author liuyy
 * @className No83
 * @description TODO
 * @date 2019/12/3 14:54
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class No83 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(1);
        node1.next.next = new ListNode(2);
        No83 no83 = new No83();
        ListNode listNode = no83.deleteDuplicates(node1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode listNode = new ListNode(0);
        if (head == null) {
            return null;
        }
        deleteDuplicates(head, listNode);
        return head.val == 0 ? listNode : listNode.next;
    }

    public void deleteDuplicates(ListNode head, ListNode listNode) {
        if (head == null) {
            return;
        }
        if (listNode.val != head.val) {
            listNode.next = new ListNode(head.val);
            deleteDuplicates(head.next, listNode.next);
        }else {
            deleteDuplicates(head.next, listNode);
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
