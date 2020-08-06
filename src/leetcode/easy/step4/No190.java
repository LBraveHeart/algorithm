package leetcode.easy.step4;

/**
 * @author: liuyy
 * @date: 2020/7/7 14:12
 */
public class No190 {
    public static void main(String[] args) {
        No190 no190 = new No190();
        no190.reverseBits(43261596);
    }
    public int reverseBits(int n) {

        String string = Integer.toBinaryString(n);
        System.out.println(string);
        StringBuilder sb = new StringBuilder();
        char[] chars = string.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return Integer.parseInt(sb.toString());
    }
}
