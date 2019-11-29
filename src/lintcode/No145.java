package lintcode;

/**
 * @author liuyy
 * @className No145
 * @description TODO
 * @date 2019/10/29 14:36
 **/
public class No145 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();

        System.out.println(getStr('a'));
        System.out.println(System.currentTimeMillis() - l);
    }
    public static char getStr(char character) {
        character -= 32;
        return character;
    }
}
