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
        treeNode.right.right = new TreeNode(7);
        No107 no107 = new No107();


        List<List<Integer>> list = no107.levelOrderBottom(treeNode);


        System.out.println(list);

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        if (root != null) {
            list1.add(root.val);
            list.add(list1);
        }
        levelOrderBottom(root, list);
        List<List<Integer>> newList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

    public void levelOrderBottom(TreeNode root, List<List<Integer>> list) {
        List<Integer> list1 = new ArrayList<>();

        if (root.left != null) {
            list1.add(root.left.val);
            list.add(list1);
            levelOrderBottom(root.left, list);
        }
        if (root.right != null) {
            list1.add(root.right.val);
            if (list1.size() != 2) {
                list.add(list1);
            }
            levelOrderBottom(root.right, list);
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
