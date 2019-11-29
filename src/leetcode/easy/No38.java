package leetcode.easy;

import java.util.Objects;

/**
 * @author liuyy
 * @className No38
 * @description 报数
 * @date 2019/10/31 10:17
 **/
public class No38 {
    public static void main(String[] args) {
        No38 no38 = new No38();
        String s = no38.countAndSay(29);

        System.out.println(s);
    }

    public String countAndSay(int n) {
        String start = "1";
        for (int i = 0; i < n - 1; i++) {
            String[] split = start.split("");
            String num = "";
            int size = 0;
            if (split.length == 1) {
                start = "11";
                continue;
            }
            StringBuilder sb = new StringBuilder();
            for (int i1 = 0; i1 < split.length; i1++) {
                String s = split[i1];
                if (i1 == 0) {
                    num = s;
                    size++;
                    continue;
                }
                if (!Objects.equals(num, s)) {
                    sb.append(size);
                    sb.append(num);
                    num = s;
                    size = 1;
                }else {
                    size ++;
                }
                if (i1 == split.length - 1) {
                    if (size > 0) {
                        sb.append(size);
                        sb.append(num);
                    }
                }
            }
            start = sb.toString();
        }
        return start;
    }
}
