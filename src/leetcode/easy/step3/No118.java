package leetcode.easy.step3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: liuyy
 * @date: 2020/6/22 17:23
 */
public class No118 {
    public static void main(String[] args) {
        No118 no118 = new No118();
        System.out.println(no118.generate(7));

    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
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
        return lists;
    }
}