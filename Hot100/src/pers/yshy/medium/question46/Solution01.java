package pers.yshy.medium.question46;

import java.util.ArrayList;
import java.util.List;

/**（错误算法）
 * 集合总数是 n!，创建 n!个集合
 * 将所有集合看作二维数组(n! * n)
 * 第一列以 1、2、3.。。n 循环赋值，第二列以 2、3、4.。。n、1 循环赋值，依次计算
 *
 * @author ysy
 * @date 2021/1/6
 * @package pers.yshy.medium.question46
 **/
public class Solution01 {
    public List<List<Integer>> permute(int[] nums) {
        if(nums == null || nums.length==0){
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>());
            return res;
        }
        // 先计算阶乘，创建集合
        int n = 1;
        for (int i = 1; i <= nums.length; i++) {
            n *= i;
        }
        List<List<Integer>> res = new ArrayList<>(n);
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < n; j++) {
                if (res.size() < j + 1) {
                    res.add(new ArrayList<>());
                }
                res.get(j).add(nums[flag]);
                flag++;
                if (flag == nums.length) {
                    flag = 0;
                }
            }
            flag = i + 1;
        }
        return res;
    }
}

/*
123
231
312
321
213
132
 */
