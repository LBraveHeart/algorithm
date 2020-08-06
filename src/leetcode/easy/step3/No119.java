package leetcode.easy.step3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: liuyy
 * @date: 2020/6/24 17:37
 */
public class No119 {
    public static void main(String[] args) {
        No119 no119 = new No119();
        List<Integer> row = no119.getRow(7);
        System.out.println(row);

    }
    public List<Integer> getRow(int rowIndex) {
        rowIndex = rowIndex + 1;
        if (rowIndex == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            if (i == 0) {
                lists.add(Collections.singletonList(1));
                continue;
            }
            if (i == 1) {
                List<Integer> integers = new ArrayList<>();
                integers.add(1);
                integers.add(1);
                lists.add(integers);
                continue;
            }
            List<Integer> list = new ArrayList<>();
            List<Integer> lastList = lists.get(i - 1);
            for (int i1 = 0; i1 <= i; i1++) {
                if (i1 == 0 || i1 == i) {
                    list.add(1);
                    continue;
                }
                list.add(lastList.get(i1 - 1) + lastList.get(i1));
            }
            lists.add(list);
        }
        return lists.get(rowIndex - 1);
    }
}
