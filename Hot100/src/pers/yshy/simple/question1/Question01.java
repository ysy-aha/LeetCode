package pers.yshy.simple.question1;

/**
 *
 * @author ysy
 * @date 2020/12/30
 * @package pers.yshy.simple.question1
 **/
public class Question01 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[] res = null;
        int[] nums = null;

        nums = new int[]{2, 11, 15, 7};
        res = s.twoSum(nums, 9);
        System.out.println(res[0] + "\t" + res[1]);

        nums = new int[]{2, 7, 11, 15};
        res = s.twoSum(nums, 9);
        System.out.println(res[0] + "\t" + res[1]);
    }
}
