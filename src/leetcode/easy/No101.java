package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyy
 * @className No101
 * @description TODO
 * @date 2019/12/3 16:11
 **/
public class No101 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return isSymmetric(t1.left,t2.right) && isSymmetric(t1.right, t2.left);

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
