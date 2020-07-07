package leetcode.easy.step1;

import java.util.*;

/**
 * @author liuyy
 * @className No1
 * @description 两数之和
 * @date 2019/10/29 15:11
 **/
public class No1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,1,45,78};
        int[] ints = twoSum(nums, 46);
        System.out.println(ints[0] + ":" + ints[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i1] == c) {
                    int[] s = new int[]{i,i1};
                    return s;
                }
            }
        }
        return null;
    }
}
