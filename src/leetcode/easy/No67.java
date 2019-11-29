package leetcode.easy;

/**
 * @author liuyy
 * @className No67
 * @description
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 *
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2019/11/8 14:29
 **/
public class No67 {
    public static void main(String[] args) {
        No67 no67 = new No67();
        System.out.println(no67.addBinary("11","1"));

    }
    public String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        int ca = 0;
        StringBuilder res = new StringBuilder();
        while (m > -1 || n > -1) {
            int sum = ca;
            sum += m > -1 ? a.charAt(m--) - '0' : 0;
            sum += n > -1 ? b.charAt(n--) - '0' : 0;
            res.append(sum % 2);
            ca = sum / 2;
        }
        res.append(ca == 0 ? "" : ca);
        return res.reverse().toString();
    }
}
