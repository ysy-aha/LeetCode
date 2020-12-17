package pers.yshy.simple.question121;

/**
 * 设置最小值(min)，最大值(max)，最大差(maxDif)
 * 循环数组，如果当前值小于最小值，就将最小值设置为当前值，
 *   这里还有个条件是判断当前元素是不是最后一个元素，是的直接break退出循环，否的话 max 要设置为下一个元素
 * 如果 当前值大于 max 的话，就将max设置为当前值
 * 如果 max > min 并且 max-min 要大于 maxDif的时候，maxDif值修改
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了98.55%的用户
 * 内存消耗：38.2 MB, 在所有 Java 提交中击败了81.71%的用户
 *
 * @Author:ysy
 * @Date:2020/12/17
 * @Package:pers.yshy.simple.question121
 **/
public class Solution01 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = -1, maxDif = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                if(i == prices.length -1){
                   break;
                }
                max = prices[i + 1];
            } else if (prices[i] > max) {
                max = prices[i];
            }
            int dif = max - min;
            if (max > min &&  dif> maxDif){
                maxDif = dif;
            }
        }
        return maxDif;
    }
}
