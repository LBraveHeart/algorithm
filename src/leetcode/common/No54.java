package leetcode.common;

import java.util.LinkedList;
import java.util.List;

/**
 * @author liuyy
 * @className No54
 * @description TODO
 * @date 2019/11/6 17:51
 **/
public class No54 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int num : matrix[i]) {
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
            for (int i1 = i; i1 < size - 1 - i; i1++) {
                int num = matrix[i1][matrix[i1].length-1-i];
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
            for (int i1 = matrix[matrix.length - 1 - i].length - 1; i1 >= 0; i1--) {
                int num = matrix[matrix.length - 1 - i][i1];
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
            for (int i1 = i; i1 < size - 1 - i; i1++) {
                int num = matrix[i1][i];
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }
        return list;
    }
}
