package leetcode.easy;

/**
 * @author: liuyy
 * @date: 2020/7/7 14:28
 */
public class No202 {
    public static void main(String[] args) {
        No202 no202 = new No202();
        boolean happy = no202.isHappy(29);
        System.out.println(happy);
    }
    public boolean isHappy(int n) {
        try {
            String s = n + "";
            String[] strings = s.split("");

            int sum = 0;
            for (String string : strings) {
                int i = Integer.parseInt(string);
                sum += (i * i);
            }
            if (sum == 1) {
                return true;
            }else {
                return isHappy(sum);
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
