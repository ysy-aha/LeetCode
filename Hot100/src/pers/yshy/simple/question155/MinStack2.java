package pers.yshy.simple.question155;

import java.util.LinkedList;

/**
 * 执行用时：7 ms, 在所有 Java 提交中击败了77.58%的用户
 * 内存消耗：40.3 MB, 在所有 Java 提交中击败了62.11%的用户

 *
 * @Author:ysy
 * @Date:2020/12/16
 * @Package:pers.yshy.simple.question155
 **/
public class MinStack2 {

    private static LinkedList<Integer> myStack = null;
    private static LinkedList<Integer> minStack = null;

    /** initialize your data structure here. */
    public MinStack2() {
        myStack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int x) {
        myStack.add(x);
        if (minStack.size() == 0 || minStack.getLast() <= x) {
            minStack.addLast(x);
        } else if(minStack.getFirst() >= x){
            minStack.addFirst(x);
        }
    }

    public void pop() {
        int last = myStack.getLast();
        myStack.removeLast();
        minStack.removeFirstOccurrence(last);
    }

    public int top() {
        return myStack.getLast();
    }

    public int getMin() {
        return minStack.getFirst();
    }
}
