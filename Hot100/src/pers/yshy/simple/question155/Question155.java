package pers.yshy.simple.question155;

/**
 * 155. 最小栈
 *
 * @Author:ysy
 * @Date:2020/12/16
 * @Package:pers.yshy.simple.question155
 **/
public class Question155 {
    public static void main(String[] args) {
        MinStack2 minStack = new MinStack2();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(512);
        minStack.push(-1024);
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
