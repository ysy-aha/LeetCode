package pers.yshy.simple.question198;

/**
 * 198. 打家劫舍
 *
 * @author ysy
 * @date 2020/12/31
 * @package pers.yshy.simple.question198
 **/
public class question198 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        int[] nums = null;
        int res = 0;

        nums = new int[]{1,2,3,1};
        res = s.rob(nums);
        System.out.println(res);

        nums = new int[]{2,7,9,3,1};
        res = s.rob(nums);
        System.out.println(res);

        nums = new int[]{2,7,9,3,1,3};
        res = s.rob(nums);
        System.out.println(res);

        nums = new int[]{};
        res = s.rob(nums);
        System.out.println(res);

        nums = new int[]{1,2};
        res = s.rob(nums);
        System.out.println(res);

        nums = new int[]{2};
        res = s.rob(nums);
        System.out.println(res);

        nums = new int[]{2,1};
        res = s.rob(nums);
        System.out.println(res);

        nums = new int[]{2,4,8,9,9,3};
        res = s.rob(nums);
        System.out.println(res);
    }
}
