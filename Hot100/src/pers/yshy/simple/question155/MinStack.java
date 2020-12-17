package pers.yshy.simple.question155;

import java.util.LinkedList;

/**
 * 执行用时：340 ms, 在所有 Java 提交中击败了5.01%的用户
 * 内存消耗：40.2 MB, 在所有 Java 提交中击败了70.13%的用户
 *
 * @Author:ysy
 * @Date:2020/12/16
 * @Package:pers.yshy.simple.question155
 **/
public class MinStack {

    private static LinkedList<Integer> myStack = null;

    /** initialize your data structure here. */
    public MinStack() {
        myStack = new LinkedList<>();
    }

    public void push(int x) {
        myStack.add(x);
    }

    public void pop() {
        myStack.removeLast();
    }

    public int top() {
        return myStack.getLast();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i : myStack){
            if(i<min){
                min = i;
            }
        }
        return min;
    }
}
