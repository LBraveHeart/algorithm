package leetcode.easy.step4;

import java.util.Objects;

/**
 * @author: liuyy
 * @date: 2020/6/28 15:57
 */
public class No171 {
    public static void main(String[] args) {
        No171 no171 = new No171();
        int number = no171.titleToNumber("CAA");
        System.out.println(number);
    }

    public int titleToNumber(String s) {
        if (s == null || Objects.equals(s, "")) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            int i1 = aChar - 64;
            if (i != chars.length - 1) {
                int i3 = 26;
                int i4 = (int) Math.pow(i3, chars.length - 1 - i);

                num += (i4 * i1);
            } else {
                num += i1;
            }
        }
        return num;

    }
}
