package pers.ysy.section900.question985;

/**
 * 顺序计算，没想到什么其他的方法，按照顺序一直算下去就好了
 * 超时
 * @Author ysy
 * @Date 2020/10/14
 **/
public class Solution01 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        // 返回结果的数组，其长度和 queries 相同
        int[] res = new int[queries.length];
        // 根据 queries 数组的元素个数计算
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            A[index] = queries[i][0] + A[index];
            // A数组中偶数的和
            int sum = 0;
            // 循环获取A数组中的偶数的和
            for (int num : A) {
                if (num % 2 == 0) {
                    sum += num;
                }
            }
            // 返回结果数组值设置
            res[i] = sum;
        }
        return res;
    }
}
