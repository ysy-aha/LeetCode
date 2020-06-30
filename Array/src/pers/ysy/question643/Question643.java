package pers.ysy.question643;

/**
 * 643. 子数组最大平均数 I
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 * 示例 1:
 *  输入: [1,12,-5,-6,50,3], k = 4
 *  输出: 12.75
 *  解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 * 注意:
 *  1. 1 <= k <= n <= 30,000。
 *  2. 所给数据范围 [-10,000，10,000]。
 * @Author ysy
 * @Date 2020/6/30
 **/
public class Question643 {
  public static void main(String[] args) {
    Solution01 s01 = new Solution01();
    double result = s01.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4);
    System.out.println("s01 = "+result);
  }
}
