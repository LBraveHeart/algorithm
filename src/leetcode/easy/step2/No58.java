package leetcode.easy.step2;

import java.util.Objects;

/**
 * @author liuyy
 * @className No58
 * @description TODO
 * @date 2019/11/7 9:39
 **/
public class No58 {
    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("a "));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (Objects.equals(s,"") || Objects.equals(s," ")) {
            return 0;
        }
        String[] s1 = s.split(" ");
        String s2 = s1[s1.length - 1];
        return s2.length();
    }
}
