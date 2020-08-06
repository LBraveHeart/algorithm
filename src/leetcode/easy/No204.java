package leetcode.easy;

/**
 * @author: liuyy
 * @date: 2020/7/7 16:28
 */
public class No204 {

    public static void main(String[] args) {
        No204 no204 = new No204();
        System.out.println(no204.countPrimes(499979));
    }

    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        int sum = n / 2;
        boolean isPrimes[] = new boolean[n];
        for (int i = 3; i * i < n; i += 2) {
            if (isPrimes[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += 2 * i) {
                if (!isPrimes[j]) {
                    sum--;
                    isPrimes[j] = true;
                }
            }
        }
        return sum;
    }
}
