package pers.yshy.simple.question155;

import java.util.ArrayList;
import java.util.List;

/**
 * 执行用时：419 ms, 在所有 Java 提交中击败了5.01%的用户
 * 内存消耗：40.3 MB, 在所有 Java 提交中击败了52.13%的用户
 *
 * @Author:ysy
 * @Date:2020/12/16
 * @Package:pers.yshy.simple.question155
 **/
public class MinStack1 {
    private static List<Integer> myStack = null;

    /** initialize your data structure here. */
    public MinStack1() {
        myStack = new ArrayList<>();
    }

    public void push(int x) {
        myStack.add(x);
    }

    public void pop() {
        myStack.remove(myStack.size()-1);
    }

    public int top() {
        return myStack.get(myStack.size()-1);
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
