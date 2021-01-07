package pers.yshy.medium.question338;

import java.util.Arrays;

/**
 * 338. 比特位计数
 *
 * @author ysy
 * @date 2021/1/7
 * @package pers.yshy.medium.question338
 **/
public class Question338 {
    public static void main(String[] args) {
        Solution01 s1 = new Solution01();
        Solution02 s2 = new Solution02();
        int[] res = null;

        res = s1.countBits(1);
        System.out.println(Arrays.toString(res).replace(" ", ""));
        res = s2.countBits(1);
        System.out.println(Arrays.toString(res).replace(" ", ""));
        res = s1.countBits(3);
        System.out.println(Arrays.toString(res).replace(" ", ""));
        res = s2.countBits(3);
        System.out.println(Arrays.toString(res).replace(" ", ""));
        res = s1.countBits(7);
        System.out.println(Arrays.toString(res).replace(" ", ""));
        res = s2.countBits(7);
        System.out.println(Arrays.toString(res).replace(" ", ""));
        res = s1.countBits(15);
        System.out.println(Arrays.toString(res).replace(" ", ""));
        res = s2.countBits(15);
        System.out.println(Arrays.toString(res).replace(" ", ""));
        res = s1.countBits(31);
        System.out.println(Arrays.toString(res).replace(" ", ""));
        res = s2.countBits(31);
        System.out.println(Arrays.toString(res).replace(" ", ""));
    }
}

/*

[0,1,1,2,1,2,2,3,1,2,2,3,3,4,4,5,1]
[0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1]

3+2+1
 */