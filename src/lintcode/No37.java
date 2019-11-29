package lintcode;

/**
 * @author liuyy
 * @className No37
 * @description TODO
 * @date 2019/10/29 14:18
 **/
public class No37 {
    public static void main(String[] args) {
        System.out.println(getNum(1534236469));
    }

    public static int getNum(int x) {

        String numStr = x + "";
        if (x < 0) {
            numStr = (x * -1) + "";
        }
        String[] split = numStr.split("");
        StringBuilder re = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            re.append(split[i]);
        }
        if (x < 0) {
            re.insert(0, "-");
        }
        int i = Integer.parseInt(re.toString().trim());
        return i;
    }
}
