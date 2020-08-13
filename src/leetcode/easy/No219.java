package leetcode.easy;

/**
 * @author: liuyy
 * @date: 2020/8/11 14:44
 */
public class No219 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i + 1; j <= (i + k) && j < nums.length; j++) {
                int num1 = nums[j];
                if (num == num1) {
                    return true;
                }
            }
        }
        return false;
    }
}
