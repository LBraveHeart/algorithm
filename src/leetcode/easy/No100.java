package leetcode.easy;

import java.util.Objects;

/**
 * @author liuyy
 * @className No100
 * @description TODO
 * @date 2019/12/3 15:59
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * <p>
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 **/
public class No100 {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuilder sb1 = new StringBuilder();
        getValueByNode(p, sb1);
        System.out.println(sb1.toString());

        StringBuilder sb2 = new StringBuilder();
        getValueByNode(q, sb2);
        System.out.println(sb2.toString());

        return Objects.equals(sb1.toString(), sb2.toString());
    }

    public void getValueByNode(TreeNode p, StringBuilder sb) {
        if (p == null) {
            sb.append("null");
        }else {
            sb.append(p.val);
            getValueByNode(p.left,sb);
            getValueByNode(p.right,sb);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

}
