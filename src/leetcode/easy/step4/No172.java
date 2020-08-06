package leetcode.easy.step4;

import java.math.BigInteger;
import java.util.Objects;

/**
 * @author: liuyy
 * @date: 2020/6/28 17:23
 */
public class No172 {
    public static void main(String[] args) {
        No172 no172 = new No172();
        int i = no172.trailingZeroes(100);
        int j = no172.trailingZeroes1(100);
        System.out.println(i);
        System.out.println(j);
    }

    public int trailingZeroes(int n) {
        if (n == 0) {
            return 0;
        }
        BigInteger num = new BigInteger(n + "");
        for (int i = n - 1; i > 0; i--) {
            num = num.multiply(new BigInteger(i + ""));
        }
        String s = num + "";
        System.out.println(num);
        String[] strings = s.split("");
        int number = 0;
        for (int i = strings.length - 1; i >= 0; i--) {
            if (Objects.equals("0", strings[i])) {
                number++;
            } else {
                break;
            }
        }
        return number;
    }

    public int trailingZeroes1(int n) {
        if (n == 0) {
            return 0;
        }
        int num = 0;
        for (int i = n; i > 0; i--) {
            if (i % 5 == 0) {
                int x = 5;
                while (i % x == 0) {
                    num ++;
                    x = x * 5;
                }
            }
        }

        return num;
    }
}
