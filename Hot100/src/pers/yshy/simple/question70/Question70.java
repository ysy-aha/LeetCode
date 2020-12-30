package pers.yshy.simple.question70;

/**
 * 70. 爬楼梯
 * @Author:ysy
 * @Date:2020/12/28
 * @Package:pers.yshy.simple.question70
 **/
public class Question70 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        Solution02 s2 = new Solution02();
        int res = 0;
        int res2 = 0;

        res = s.climbStairs(1);
        res2 = s2.climbStairs(1);
        System.out.println(1 + "\t" + res + "\t" + res2);
        res = s.climbStairs(2);
        res2 = s2.climbStairs(2);
        System.out.println(2 + "\t" + res + "\t" + res2);
        res = s.climbStairs(3);
        res2 = s2.climbStairs(3);
        System.out.println(3 + "\t" + res + "\t" + res2);
        res = s.climbStairs(4);
        res2 = s2.climbStairs(4);
        System.out.println(4 + "\t" + res + "\t" + res2);
        res = s.climbStairs(5);
        res2 = s2.climbStairs(5);
        System.out.println(5 + "\t" + res + "\t" + res2);
        res = s.climbStairs(6);
        res2 = s2.climbStairs(6);
        System.out.println(6 + "\t" + res + "\t" + res2);
        res = s.climbStairs(7);
        res2 = s2.climbStairs(7);
        System.out.println(7 + "\t" + res + "\t" + res2);
        res = s.climbStairs(8);
        res2 = s2.climbStairs(8);
        System.out.println(8 + "\t" + res + "\t" + res2);
        res = s.climbStairs(9);
        res2 = s2.climbStairs(9);
        System.out.println(9 + "\t" + res + "\t" + res2);
    }
}
