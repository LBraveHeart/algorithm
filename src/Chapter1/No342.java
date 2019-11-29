package Chapter1;

/**
 * @author liuyy
 * @className No342
 * @description TODO
 * @date 2019/5/22 16:43
 **/
public class No342 {
    public static void main(String[] args) {
        boolean powerOfFour = isPowerOfFour1(256);
        System.out.println(powerOfFour);
    }

    public static boolean isPowerOfFour(int num){
        while ((num != 0) && (num % 4 == 0)) {
            num /= 4;
        }
        return num == 1;
    }
    public static boolean isPowerOfFour1(int num){
        if (num <= 0) {
            return false;
        }
        if ((num & num-1) != 0) {
            return false;
        }
        if ((num & 0x55555555) == num) {
            return true;
        }
        return false;
    }
}
