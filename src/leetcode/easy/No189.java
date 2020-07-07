package leetcode.easy;

/**
 * @author: liuyy
 * @date: 2020/7/6 15:33
 */
public class No189 {
    public static void main(String[] args) {
        No189 no189 = new No189();
        no189.rotate(new int[]{1,2,3,4,5,6,7}, 5);
    }
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int numsTest[] = new int[length];
        for (int i = 0; i < nums.length; i++) {
            int index = i + k;

            while (index > (length - 1)) {
                index -= length;
            }
            numsTest[index] = nums[i];
        }
        for (int i = 0; i < numsTest.length; i++) {
            nums[i] = numsTest[i];
        }

    }
}
