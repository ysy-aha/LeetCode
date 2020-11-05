package pers.ysy.section1200.question1217;

/**
 * 循环，计算数组中有多少个奇数，多少个偶数，奇数结果加一
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：36.3 MB, 在所有 Java 提交中击败了53.89%的用户
 * @Author ysy
 * @Date 2020/11/5
 **/
public class Solution01 {
    public int minCostToMoveChips(int[] position) {
        int oddNum = 0, evenNum = 0;
        for (int i : position){
            if(i%2 == 0){
                evenNum ++;
                continue;
            }
            oddNum ++;
        }
        return oddNum > evenNum ? evenNum : oddNum;
    }
}
