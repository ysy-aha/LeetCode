package pers.yshy.question303;

/**
 * 303. 区域和检索 - 数组不可变
 * @author ysy
 * @date 2021/3/2
 * @package pers.yshy.question303
 **/
public class Question303 {
    public static void main(String[] args) {
        NumArray1 num = new NumArray1(new int[]{-2, 0, 3, -5, 2, -1});
        int res = num.sumRange(0,2);
        System.out.println(res);
        res = num.sumRange(2,5);
        System.out.println(res);
        res = num.sumRange(0,5);
        System.out.println(res);

        num = new NumArray1(new int[]{1});
        res = num.sumRange(0,0);
        System.out.println(res);
    }
}
