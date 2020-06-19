package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liuyy
 * @Date: 2020/6/18 18:36
 */
public class No136 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            if (numMap.containsKey(num)) {
                numMap.put(num, numMap.get(num) + 1);
            }else {
                numMap.put(num, 1);
            }
        }
        for (Integer integer : numMap.keySet()) {
            Integer count = numMap.get(integer);
            if (count == 1) {
                return;
            }
        }
    }
}
