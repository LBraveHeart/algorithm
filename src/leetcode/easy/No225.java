package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liuyy
 * @date: 2020/9/8 16:36
 */
public class No225 {

    private List<Integer> list;

    /**
     * Initialize your data structure here.
     */
    public No225() {
        list = new ArrayList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        list.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (list == null || list.size() == 0) {
            return -1;
        }
        int pop = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return pop;
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (list == null || list.size() == 0) {
            return -1;
        }
        //        list.remove(list.size() - 1);
        return list.get(list.size() - 1);
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return list == null || list.size() == 0;
    }

    public static void main(String[] args) {

    }
}
