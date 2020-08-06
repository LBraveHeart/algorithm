package leetcode.easy.step3;

import java.util.Objects;

/**
 * @Author: liuyy
 * @Date: 2020/6/18 18:24
 */
public class No125 {
    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";

        char[] chars = test.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            char aChar = chars[i];
            if ((aChar >= 65 && aChar <= 90) || (aChar >= 97 && aChar <= 122) || (aChar >= 48 && aChar <= 57) ) {
                sb1.append((aChar + "" ).toLowerCase());
            }
        }

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if ((aChar >= 65 && aChar <= 90) || (aChar >= 97 && aChar <= 122) || (aChar >= 48 && aChar <= 57) ) {
                sb2.append((aChar + "").toLowerCase());
            }
        }
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        System.out.println(Objects.equals(sb1.toString(), sb2.toString()));
    }
}
