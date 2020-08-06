package leetcode.easy.step4;

/**
 * @author: liuyy
 * @date: 2020/6/29 15:57
 */
public class No198 {
    public static void main(String[] args) {
        int []nums = new int[]{2,7,9,3,1};
        No198 no198 = new No198();
        System.out.println(no198.rob(nums));

    }

    public int rob(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        int sum1 = 0;
        for (int i = 1; i < nums.length; i += 2) {
            sum1 += nums[i];
        }
        return Math.max(sum, sum1);
    }
}
