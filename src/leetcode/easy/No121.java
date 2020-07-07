package leetcode.easy;

import java.nio.channels.Pipe;

/**
 * @Author: liuyy
 * @Date: 2020/6/19 18:08
 */
public class No121 {
    public static void main(String[] args) {
        int prices[] = new int[]{7,1,5,3,6,4};
        System.out.println(new No121().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int buy = 0;
        int sale = 0;
        int lir = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (i == 0) {
                buy = price;
            }
            if (price < buy) {
                buy = price;
                sale = 0;
            }
            if (sale < price) {
                sale = price;
            }
            System.out.println("sale = " + sale);
            System.out.println("buy = " + buy);
            if (lir < (sale - buy)) {
                lir = sale - buy;
                System.out.println("lir = " + lir);
            }
            System.out.println("-----------");
        }
        return lir;
    }
}
