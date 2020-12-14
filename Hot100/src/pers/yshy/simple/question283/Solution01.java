package pers.yshy.simple.question283;

/**
 * 设置两个标记，一个记录当前位置x，一个记录当前位置后非零的位置y，
 * 然后将nums[x+1]=nums[y]，nums[y]=0
 * x++, y++
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.5 MB, 在所有 Java 提交中击败了88.49%的用户
 *
 * @Author:ysy
 * @Date:2020/12/14
 * @Package:pers.yshy.simple.question283
 **/
public class Solution01 {

    public void moveZeroes(int[] nums) {
        int x = 0, y = 0;
        while (y < nums.length) {
            // 第一阶段，x==y && nums[y] != 0
            if (x == y && nums[y] != 0) {
                x++;
                y++;
            } else if (x <= y && nums[y] == 0 && nums[x] == 0) {
                y++;
            } else if (x <= y && nums[y] != 0 && nums[x] == 0) {
                nums[x] = nums[y];
                nums[y] = 0;
                x++;
                y++;
            } else if (x <= y && nums[y] != 0 && nums[x] != 0) {
                x++;
            }
        }
    }

}
