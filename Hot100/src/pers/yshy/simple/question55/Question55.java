package pers.yshy.simple.question55;

/**
 * 53. 最大子序和
 *
 * @Author:ysy
 * @Date:2020/12/19
 * @Package:pers.yshy.simple.question55
 **/
public class Question55 {
    public static void main(String[] args) {
        Solution03 s = new Solution03();
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int res = s.maxSubArray(arr);
        System.out.println(res);

        arr = new int[]{1,2,3,4,5};
        res = s.maxSubArray(arr);
        System.out.println(res);

        arr = new int[]{-1,-2,-3,-4,-5};
        res = s.maxSubArray(arr);
        System.out.println(res);

        arr = new int[]{-1};
        res = s.maxSubArray(arr);
        System.out.println(res);

        arr = new int[]{-3,1,-2,2};
        res = s.maxSubArray(arr);
        System.out.println(res);

        arr = new int[]{2,-2,1,-3};
        res = s.maxSubArray(arr);
        System.out.println(res);
    }
}
