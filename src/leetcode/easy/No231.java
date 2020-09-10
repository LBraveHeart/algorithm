package leetcode.easy;

/**
 * @author: liuyy
 * @date: 2020/9/8 16:57
 */
public class No231 {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; ; i++) {
            double pow = Math.pow(2, i);
            if (pow > n) {
                return false;
            }
            if (pow == n) {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        No231 no231 = new No231();
        System.out.println(no231.isPowerOfTwo(218));
    }
}
