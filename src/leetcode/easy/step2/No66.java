package leetcode.easy.step2;

import java.util.Arrays;

/**
 * @author liuyy
 * @className No66
 * @description
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2019/11/7 10:06
 **/
public class No66 {
    public static void main(String[] args) {
        int[] nums = new int[]{9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = new int[digits.length+1];
        temp[0] = 1;
        return temp;
    }
}
