package pers.ysy.section200.question204;

/**
 * 204. 计数质数
 * 统计所有小于非负整数 n 的质数的数量。
 * 示例 1：
 *   输入：n = 10
 *   输出：4
 *   解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * 示例 2：
 *   输入：n = 0
 *   输出：0
 * 示例 3：
 *   输入：n = 1
 *   输出：0
 *
 * 提示：
 *   0 <= n <= 5 * 10^6
 *
 * @Author:ysy
 * @Date:2020/12/3
 * @Package:pers.ysy.section200.question204
 **/
public class Question204 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int res = s.countPrimes(10);
        System.out.println(res);

        res = s.countPrimes(0);
        System.out.println(res);

        res = s.countPrimes(1);
        System.out.println(res);
    }
}
