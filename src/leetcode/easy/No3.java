package leetcode.easy;

import java.util.*;

/**
 * @author liuyy
 * @className No3
 * @description TODO
 * @date 2019/10/29 16:20
 **/
public class No3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    public static int lengthOfLongestSubstring1(String s) {
        int length = s.length();
        Set<String> set = new HashSet<>();
        for (int i = length; i > 0; i--) {
            for (int i1 = 0; i1 <= length - i; i1++) {
                set.clear();
                String s1 = s.substring(i1, i1 + i);
                String[] split = s1.split("");
                if (s1.substring(1).contains(split[0])) {
                    continue;
                }
                if (s1.substring(0, s1.length() - 1).contains(split[split.length - 1])) {
                    continue;
                }
                boolean flag = false;
                for (String s2 : split) {
                    if (set.contains(s2)) {
                        flag = true;
                        break;
                    }
                    set.add(s2);
                }
                if (!flag) {
                    return s1.length();
                }
            }
        }
        return 0;
    }
    public static int lengthOfLongestSubstring(String s) {
        String[] split = s.split("");
        String longStr = "";
        int longStrLength = 0;
        for (String s1 : split) {
            if (!longStr.contains(s1)) {
                longStr += s1;
            }else {
                if (longStr.length() > longStrLength) {
                    longStrLength = longStr.length();
                }
                System.out.println(longStr + "-" + s1);
                if (longStr.split(s1).length == 1 || longStr.split(s1).length == 0) {
                    longStr = s1;
                }else {
                    longStr = longStr.split(s1)[1] + s1;
                }
            }
            if (longStr.length() > longStrLength) {
                longStrLength = longStr.length();
            }
        }
        return longStrLength;
    }
}
