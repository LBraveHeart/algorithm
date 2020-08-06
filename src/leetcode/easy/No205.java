package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liuyy
 * @date: 2020/7/7 16:59
 */
public class No205 {
    public static void main(String[] args) {
        No205 no205 = new No205();
        boolean isomorphic = no205.isIsomorphic("foo", "bar");
        System.out.println(isomorphic);
    }

    public boolean isIsomorphic(String s, String t) {
        if (s == null ^ t == null || s == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        String[] strings = s.split("");
        String[] strings1 = t.split("");
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(strings1[i])) {
                return false;
            }
            if (map.containsKey(strings[i])) {
                sb.append(map.get(strings[i]));
            } else {
                map.put(strings[i], strings1[i]);
                sb.append(map.get(strings[i]));
            }
        }
        return t.equals(sb.toString());

    }
}
