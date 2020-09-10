package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: liuyy
 * @date: 2020/9/10 17:07
 */
public class No232 {
    private List<Integer> list;

    /** Initialize your data structure here. */
    public No232() {
        list = new ArrayList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        list.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (list == null || list.size() == 0) {
            return -1;
        }
        int pop = list.get(0);
        list.remove(0);
        return pop;
    }

    /** Get the front element. */
    public int peek() {
        if (list == null || list.size() == 0) {
            return -1;
        }
        //        list.remove(list.size() - 1);
        return list.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return list == null || list.size() == 0;
    }
}
