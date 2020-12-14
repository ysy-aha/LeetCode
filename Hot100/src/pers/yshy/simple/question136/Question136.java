package pers.yshy.simple.question136;

/**
 * 136. 只出现一次的数字
 *
 * @Author:ysy
 * @Date:2020/12/11
 * @Package:pers.yshy.simple.question136
 **/
public class Question136 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[] arr = new int[]{2,2,1};
        int res = s.singleNumber(arr);
        System.out.println(res);

        arr = new int[]{4,1,2,1,2};
        res = s.singleNumber(arr);
        System.out.println(res);
    }
}
