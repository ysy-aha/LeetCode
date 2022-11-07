package pers.yshy.easy.q000001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author ysy
 * @since 2022/11/7
 */
public class Q000001 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum1(nums, target);
        System.out.println(res[0] + " :: " + res[1]);

        nums = new int[]{3, 2, 4};
        target = 6;
        res = twoSum1(nums, target);
        System.out.println(res[0] + " :: " + res[1]);

        nums = new int[]{3, 3};
        target = 6;
        res = twoSum1(nums, target);
        System.out.println(res[0] + " :: " + res[1]);
    }

    /**
     * 1. 循环，target-nums[i]=diff
     * 2. 如果HashMap存在key=diff，输出[i,map.get(diff)]
     * 3. 否则map.put(nums[i], i)
     *
     * 用时：5 ms，击败：49.91%
     * 内存：42.6 MB，击败：5%
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum1(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>(len);
        int[] res = new int[2];
        for (int i = 0; i < len; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                res[1] = i;
                res[0] = map.get(diff);
            } else {
                map.put(nums[i], i);
            }
        }
        return res;
    }
}

/*
1. 首先想到嵌套循环，但是可能会超时
2. 可以使用HashMap的Key，但是无法处理数组中的重复值


 */
