package pers.yshy.simple.question121;

/**
 * 121. 买卖股票的最佳时机
 *
 * @Author:ysy
 * @Date:2020/12/17
 * @Package:pers.yshy.simple.question121
 **/
public class Question121 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int res = s.maxProfit(prices);
        System.out.println(res);

        prices = new int[]{7, 6, 4, 3, 1};
        res = s.maxProfit(prices);
        System.out.println(res);

        prices = new int[]{7, 2, 5, 3, 6, 4, 1, 3};
        res = s.maxProfit(prices);
        System.out.println(res);

        prices = new int[]{7, 2, 5, 3, 6, 4, 1, 6};
        res = s.maxProfit(prices);
        System.out.println(res);

        prices = new int[]{7, 1};
        res = s.maxProfit(prices);
        System.out.println(res);

        prices = new int[]{7, 8};
        res = s.maxProfit(prices);
        System.out.println(res);

        prices = new int[]{7};
        res = s.maxProfit(prices);
        System.out.println(res);

        prices = new int[]{1, 2, 4, 1};
        res = s.maxProfit(prices);
        System.out.println(res);
    }
}
