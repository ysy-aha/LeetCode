package pers.yshy.simple.question70;

/**
 * 使用递归(超时)
 *
 * @Author:ysy
 * @Date:2020/12/28
 * @Package:pers.yshy.simple.question70
 **/
public class Solution01 {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int n1 = climbStairs(n - 1);
        int n2 = climbStairs(n - 2);
        return n1 + n2;
    }

}

/*
1 1
2 2
3 3
4 5
5 8
6 13
7 21

 */
