package leetcode.easy;

/**
 * @author liuyy
 * @className No35
 * @description TODO
 * @date 2019/10/30 17:54
 **/
public class No35 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        No35 no35 = new No35();
        int i = no35.searchInsert(nums, 0);
        System.out.println(i);
    }
    public int searchInsert(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            if (num == target) {
                return i;
            }
            if (target > num) {
                return i+1;
            }
        }
        return 0;
    }
}
