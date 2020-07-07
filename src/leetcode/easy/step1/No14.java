package leetcode.easy.step1;

/**
 * @author liuyy
 * @className No14
 * @description 最长公共前缀
 * @date 2019/10/30 14:19
 **/
public class No14 {
    public static void main(String[] args) {
        No14 no14 = new No14();
        String[] strings = new String[]{"flower","flow","flight"};
        String s = no14.longestCommonPrefix(strings);
        System.out.println(s);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int length = 0;
        int index = 0;
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            if (length == 0) {
                length = str.length();
            }
            if (length > str.length()) {
                length = str.length();
                index = i;
            }
        }
        String str = strs[index];

        for (int i = str.length(); i > 0; i--) {
            String substring = str.substring(0, i);
            boolean flag = false;
            for (String s : strs) {
                flag = false;
                if (!s.startsWith(substring)) {
                    break;
                }
                flag = true;
            }
            if (flag) {
                return substring;
            }
        }
        return "";
    }
}
