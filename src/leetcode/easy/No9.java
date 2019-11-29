package leetcode.easy;

import java.util.Objects;

/**
 * @author liuyy
 * @className No9
 * @description 回文数
 * @date 2019/10/30 12:15
 **/
public class No9 {
    public static void main(String[] args) {
        No9 no9 = new No9();
        boolean palindrome = no9.isPalindrome(10);
        System.out.println(palindrome);
    }
    public boolean isPalindrome(int x) {
        String numStr = x + "";
        String origin = x + "";
        if (x < 0) {
            numStr = (x * -1) + "";
        }
        String[] split = numStr.split("");
        StringBuilder re = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            re.append(split[i]);
        }
        if (x < 0) {
            re.append("-");
        }
        if (Objects.equals(origin, re.toString())) {
            return true;
        }
        return false;
    }
}
