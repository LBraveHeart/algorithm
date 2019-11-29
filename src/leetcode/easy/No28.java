package leetcode.easy;

import java.util.Objects;

/**
 * @author liuyy
 * @className No28
 * @description TODO
 * @date 2019/10/30 17:38
 **/
public class No28 {
    public static void main(String[] args) {
        No28 no28 = new No28();

        int i = no28.strStr("hello", "ll");
        System.out.println(i);
    }

    public int strStr(String haystack, String needle) {
        return Objects.equals(needle,"") ? 0 : haystack.indexOf(needle);
    }
}
