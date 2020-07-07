package leetcode.easy.step1;

/**
 * @author liuyy
 * @className No7
 * @description  整数反转
 * @date 2019/10/30 12:11
 **/
public class No7 {
    public static void main(String[] args) {
        System.out.println(getNum(1534236469));
    }

    public static int getNum(int x) {

        String numStr = x + "";
        StringBuilder re = new StringBuilder();
        if (x < 0) {
            numStr = (x * -1) + "";
            re.append("-");
        }
        String[] split = numStr.split("");
        for (int i = split.length - 1; i >= 0; i--) {
            re.append(split[i]);
        }
        try {
            int i = Integer.parseInt(re.toString().trim());
            return i;
        }catch (Exception e) {
            return 0;
        }
    }
}
