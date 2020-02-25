package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyy
 * @className No107
 * @description TODO
 * @date 2019/12/4 15:39
 **/
public class No107 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right= new TreeNode(7);

        List<Integer> list = new ArrayList<>();

        No107 no107 = new No107();
        no107.getValueByNode(treeNode, list);

        System.out.println(list);


    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        return null;
    }

    private void getValueByNode(TreeNode p, List<Integer> list) {
        if (p != null) {
            list.add(p.val);
            getValueByNode(p.left,list);
            getValueByNode(p.right,list);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
