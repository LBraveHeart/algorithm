package leetcode.easy;

/**
 * @author: liuyy
 * @date: 2020/8/11 14:51
 */
public class No220 {
    public static void main(String[] args) {
        System.out.println(containsNearbyAlmostDuplicate(new int[]{-1, 2147483647}, 1, 2147483647));

    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length; i++) {
            Long num = Long.parseLong(nums[i] + "");
            for (int j = i + 1; j <= (i + k) && j < nums.length; j++) {
                Long num1 = Long.parseLong(nums[j] + "");
                if (num <= num1 && (num1 - num) <= t) {
                    return true;
                }
                if (num > num1 && (num - num1) <= t) {
                    return true;
                }

            }
        }
        return false;
    }
}
