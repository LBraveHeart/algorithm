package leetcode.easy;

/**
 * @author: liuyy
 * @date: 2020/6/24 18:00
 */
public class No168 {
    public static void main(String[] args) {
        No168 no168 = new No168();
        System.out.println(no168.convertToTitle(2055));

    }

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int c = n % 26;
            if(c == 0){
                c = 26;
                n -= 1;
            }
            sb.insert(0, (char) ('A' + c - 1));
            n /= 26;
        }
        return sb.toString();

    }
}
