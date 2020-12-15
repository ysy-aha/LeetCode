package pers.yshy.simple.question448;

import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 *
 * @Author:ysy
 * @Date:2020/12/15
 * @Package:pers.yshy.simple.question448
 **/
public class Question448 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> res = s.findDisappearedNumbers(nums);
        res.forEach((item) -> {
            System.out.print(item + "\t");
        });
        System.out.println();
    }
}
