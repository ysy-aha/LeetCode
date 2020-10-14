package pers.ysy.question985;

/**
 * solution01 改良
 * 先计算A数组中的偶数和，然后计算的时候判断，A元素修改前是否是偶数，修改后是否是偶数
 *
 * 执行用时：5 ms, 在所有 Java 提交中击败了85.69%的用户
 * 内存消耗：46.7 MB, 在所有 Java 提交中击败了79.47%的用户
 * @Author ysy
 * @Date 2020/10/14
 **/
public class Solution02 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        // 返回结果的数组，其长度和 queries 相同
        int[] res = new int[queries.length];
        // A数组中偶数的和
        int sum = 0;
        // 循环获取A数组中的偶数的和
        for (int num : A) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        // 根据 queries 数组的元素个数计算
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            int temp = A[index];
            A[index] = queries[i][0] + A[index];
            // 如果 A[index] 不是偶数，temp也不是偶数，直接返回sum
            // 如果 A[index] 是偶数，temp不是偶数，sum + A[index]
            // 如果 A[index] 不是偶数，temp是偶数，sum - temp
            // 如果 A[index] 是偶数，temp也是偶数，sum + A[index] - temp
            if (temp % 2 != 0 && A[index] % 2 == 0) {
                sum += A[index];
            } else if (temp % 2 == 0 && A[index] % 2 != 0) {
                sum -= temp;
            } else if (temp % 2 == 0 && A[index] % 2 == 0) {
                sum = sum + A[index] - temp;
            }
            // 返回结果数组值设置
            res[i] = sum;
        }
        return res;
    }
}
