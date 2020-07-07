package leetcode.easy.step1;

import java.util.Objects;

/**
 * @author liuyy
 * @className No20
 * @description 有效的括号
 * @date 2019/10/30 14:40
 **/
public class No20 {
    public static void main(String[] args) {
        No20 no20 = new No20();
        boolean valid = no20.isValid("([])");
        System.out.println(valid);
    }

    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replaceAll("\\(\\)","");
            s = s.replaceAll("\\[\\]","");
            s = s.replaceAll("\\{\\}","");
        }
        return Objects.equals(s,"");
    }
}
