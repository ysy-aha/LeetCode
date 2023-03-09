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
        int target;
        int[] nums;
        int[] res;

        target = 9;
        nums = new int[]{2, 7, 11, 15};
        res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));

        target = 6;
        nums = new int[]{3, 2, 4};
        res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));

        target = 6;
        nums = new int[]{3, 3};
        res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    /**
     * 循环
     * 创建一个Map，将target-nums[i]的值作为key，下标作为value
     * 遇到map.containKey(nums[i])==true时，取value和i
     *
     * 时间 2 ms，击败 76.95%
     * 内存 41.2 MB，击败 97.72%
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{0, 0};
    }
}



