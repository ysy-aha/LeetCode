package pers.ysy.question605;

/**
 * 暴力破解法
 * 直接循环数组，判断是否合格.
 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.1 MB, 在所有 Java 提交中击败了8.33%的用户
 * @Author ysy
 * @Date 2020/6/28
 * */
public class Solution01 {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    // 计算0的个数，首位和末位只需要两个0就可以插入
    int count = 1;
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 0) {
        count++;
        if(i == flowerbed.length-1){
          count++;
        }
      } else {
        count = 0;
      }
      if (count >= 3) {
        n--;
        count = 1;
      }
    }
    return n <= 0;
  }
}
