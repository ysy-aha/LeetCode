package pers.yshy.easy.q000121;

/**
 * 买卖股票的最佳时机
 *
 * @author ysy
 * @since 2022/11/22
 */
public class Q000121 {

    public static void main(String[] args) {
        int[] prices;
        int res;

        prices = new int[]{7, 1, 5, 3, 6, 4};
        res = maxProfit(prices);
        System.out.println(res);

        prices = new int[]{7, 6, 4, 3, 1};
        res = maxProfit(prices);
        System.out.println(res);

        prices = new int[]{7, 2, 5, 3, 6, 4, 1, 5};
        res = maxProfit(prices);
        System.out.println(res);

        prices = new int[]{7, 1, 5, 3, 6, 4, 1, 7};
        res = maxProfit(prices);
        System.out.println(res);
    }

    /**
     * 时间：3 ms，击败：30.74%
     * 内存：57.8 MB，击败：32.88%
     *
     * @param prices
     * @return
     */
    private static int maxProfit(int[] prices) {
        int bestPrice = 0;
        // 定义最低价格和最高价格的下标
        int lowestPriceIndex = 0;
        int highestPriceIndex = 0;
        // 遍历价格数组
        for (int i = 1; i < prices.length; i++) {
            // 如果当前价格小于前面的最低价格，此时最低/高价格需要重置，从当前价格开始算
            if (prices[i] < prices[lowestPriceIndex]) {
                // 如果当前价格小于前面的最低价格，此时最低/高价格需要重置，从当前价格开始算
                lowestPriceIndex = i;
                highestPriceIndex = i;
            } else if (prices[i] > prices[highestPriceIndex]) {
                // 如果当前价格大于前面的最高价，此时最高价需要重置
                highestPriceIndex = i;
            }
            // 每次计算一次最高价和最低价之差
            int temp = prices[highestPriceIndex] - prices[lowestPriceIndex];
            // 如果当前价格的差值大于最低价格和最高价格之差，则更新最低价格和最高价格
            if (temp > bestPrice) {
                bestPrice = temp;
            }
        }
        // 返回最低价格和最高价格之差
        return bestPrice;
    }
}
