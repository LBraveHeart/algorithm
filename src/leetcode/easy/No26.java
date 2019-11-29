package leetcode.easy;

/**
 * @author liuyy
 * @className No26
 * @description TODO
 * @date 2019/10/30 15:57
 **/
public class No26 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        No26 no26 = new No26();
        int i = no26.removeDuplicates(nums);
        System.out.println(i);
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println(nums[i1]);
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int size = 1;
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[size - 1] != nums[i]) {
                nums[size++] = nums[i];
            }
        }
        return size;
    }


}
