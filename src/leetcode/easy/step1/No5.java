package leetcode.easy.step1;

import java.util.Objects;

/**
 * @author liuyy
 * @className No5
 * @description TODO
 * @date 2019/10/29 18:03
 **/
public class No5 {

    public static void main(String[] args) {

        No5 no5 = new No5();
        String s = no5.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
        System.out.println(s);

    }
    public String longestPalindrome(String s) {
        int length = s.length();
        String hui = "";
        for (int i = length; i > 0; i--) {
            for (int i1 = 0; i1 <= length - i; i1++) {
                String s1 = s.substring(i1, i1 + i);
                boolean hui1 = isHui(s1);
                if (hui1) {
                    if (hui.length() < s1.length()) {
                        return s1;
                    }
                }
            }
        }
        return hui;
    }

    public boolean isHui(String s) {
        String[] split = s.split("");
        int length = split.length;
        String left = "";
        String right = "";
        if (length == 2) {
            left = split[0];
            right = split[1];
        }else {
            if (length % 2 == 0) {
                int end = length / 2;
                left = s.substring(0, end);
                right = s.substring(end,length);
            }else {
                int z = length / 2;
                left = s.substring(0, z);
                right = s.substring(z + 1, length);
            }
        }

        StringBuilder sb = new StringBuilder();
        String[] split1 = right.split("");
        for (int i = split1.length - 1; i >= 0; i--) {
            sb.append(split1[i]);
        }
        if (Objects.equals(left, sb.toString())) {
            return true;
        }
        return false;
    }
}
