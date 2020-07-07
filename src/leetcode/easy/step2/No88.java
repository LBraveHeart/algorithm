package leetcode.easy.step2;

/**
 * @author liuyy
 * @className No88
 * @description TODO
 * @date 2019/12/3 15:21
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class No88 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};

        No88 no88 = new No88();
        no88.merge(nums1, 3, nums2, 3);
        for (int i : nums1) {
            System.out.print(i + ",");
        }

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m;
        for (int i = 0; i < n; i++) {
            nums1[index] = nums2[i];
            index++;
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i; j < nums1.length; j++) {
                if (nums1[i] > nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}
