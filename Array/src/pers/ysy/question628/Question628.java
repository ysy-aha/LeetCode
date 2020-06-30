package pers.ysy.question628;

/**
 * 628. 三个数的最大乘积
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * 示例 1:
 *  输入: [1,2,3]
 *  输出: 6
 * 示例 2:
 *  输入: [1,2,3,4]
 *  输出: 24
 * 注意:
 *  1. 给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]
 *  2. 输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
 * @Author ysy
 * @Date 2020/6/30
 **/
public class Question628 {
  public static void main(String[] args) {
    Solution01 s01 = new Solution01();
    int result = s01.maximumProduct(new int[]{-2,-3,-4,1,2,3});
    System.out.println("s01 = "+ result);
  }
}
