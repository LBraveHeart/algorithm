package leetcode.easy;

/**
 * @author liuyy
 * @className No27
 * @description 移除元素
 * @date 2019/10/30 17:15
 **/
public class No27 {
    public static void main(String[] args) {
        No27 no27 = new No27();
        int[] nums = new int[]{3,2,2,3};
        int element = no27.removeElement(nums, 2);

        System.out.println(element);
        for (int i = 0; i < element; i++) {
            System.out.println(nums[element]);
        }
    }

    public int removeElement(int[] nums, int val) {
        int size = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[size++] = nums[i];
            }
        }
        return size;
    }
}
