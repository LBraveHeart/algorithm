package leetcode.easy.step1;

import java.util.LinkedList;
import java.util.List;

/**
 * @author liuyy
 * @className No4
 * @description TODO
 * @date 2019/10/29 17:34
 **/
public class No4 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = Math.max(nums1.length, nums2.length);
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (nums1.length > i) {
                list.add(nums1[i]);
            }
            if (nums2.length > i) {
                list.add(nums2[i]);
            }
        }
        list.sort(Integer::compare);
        System.out.println(list);
        if (list.size() % 2 == 0) {
            int end = list.size() / 2;
            int start = end - 1;
            java.math.BigDecimal b1 = new java.math.BigDecimal(list.get(start) + list.get(end));
            java.math.BigDecimal b2 = new java.math.BigDecimal(2);
            return b1.divide(b2, 10, 4).doubleValue();
        }else {
            int z = list.size() / 2;
            return list.get(z);
        }



    }
}
