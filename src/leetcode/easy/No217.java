package leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: liuyy
 * @date: 2020/7/9 16:22
 */
public class No217 {
    public static void main(String[] args) {
        No217 no217 = new No217();
        System.out.println(no217.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
