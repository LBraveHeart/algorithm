package leetcode.easy;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                return true;
            } else {
                list.add(num);
            }
        }
        return false;
    }
}
