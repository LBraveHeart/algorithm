package leetcode.easy;

/**
 * @author liuyy
 * @className No13
 * @description 罗马数字转整数
 * @date 2019/10/30 12:21
 **/
public class No13 {
    public static void main(String[] args) {
        No13 no13 = new No13();
        int ix = no13.romanToInt("MCMXCIV");
        System.out.println(ix);
    }

    public int romanToInt(String s) {

        s = s.replaceAll("IV","IIII").replaceAll("IX","IIIIIIIII");
        s = s.replaceAll("XL","XXXX").replaceAll("XC","XXXXXXXXX");
        s = s.replaceAll("CD","CCCC").replaceAll("CM","CCCCCCCCC");

        int num = 0;
        String[] split = s.split("");
        for (String s1 : split) {
            switch (s1) {
                case "I":
                    num += 1;
                    break;
                case "V":
                    num += 5;
                    break;
                case "X":
                    num += 10;
                    break;
                case "L":
                    num += 50;
                    break;
                case "C":
                    num += 100;
                    break;
                case "D":
                    num += 500;
                    break;
                case "M":
                    num += 1000;
                    break;
                default:
                    num += 0;
                    break;
            }
        }
        return num;
    }

}
