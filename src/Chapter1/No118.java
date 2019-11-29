package Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liuyy
 * @className No118
 * @description TODO
 * @date 2019/5/22 16:58
 **/
public class No118 {

    public static void main(String[] args) {
        List<List<Integer>> triangle = triangle(3);
        System.out.println(triangle);
    }
    public static List<List<Integer>> triangle(int num){
        List<List<Integer>> integers = new ArrayList<>();
        if (num < 1) { return integers; }
        int lineNum = 1;
        for (int i = 0 ; i < num; i++) {
            List<Integer> integerList = Arrays.asList(new Integer[i+1]);
            integerList.set(0,1);
            integerList.set(i,1);
            for (int j = 1;j < i; j++) {
                integerList.set(j,integers.get(i-1).get(j-1)+integers.get(i-1).get(j));
            }
            integers.add(integerList);
        }
        return integers;
    }
}
