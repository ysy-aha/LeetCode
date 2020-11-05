package pers.ysy.section1200.question1200;

import java.util.List;

/**
 * 1200. 最小绝对差
 * 给你个整数数组 arr，其中每个元素都 不相同。
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 *
 * 示例 1：
 *   输入：arr = [4,2,1,3]
 *   输出：[[1,2],[2,3],[3,4]]
 * 示例 2：
 *   输入：arr = [1,3,6,10,15]
 *   输出：[[1,3]]
 * 示例 3：
 *   输入：arr = [3,8,-10,23,19,-4,-14,27]
 *   输出：[[-14,-10],[19,23],[23,27]]
 *
 * 提示：
 *   2 <= arr.length <= 10^5
 *   -10^6 <= arr[i] <= 10^6
 *
 * @Author ysy
 * @Date 2020/11/4
 **/
public class Question1200 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[] arr = new int[]{4,2,1,3};
        List<List<Integer>> list = s.minimumAbsDifference(arr);
        System.out.println(list);

        arr = new int[]{1,3,6,10,15};
        list = s.minimumAbsDifference(arr);
        System.out.println(list);

        arr = new int[]{3,8,-10,23,19,-4,-14,27};
        list = s.minimumAbsDifference(arr);
        System.out.println(list);

        arr = new int[]{3,8};
        list = s.minimumAbsDifference(arr);
        System.out.println(list);
    }
}
