package pers.yshy.medium.question78;

import java.util.List;

/**
 *
 * @author ysy
 * @date 2021/1/5
 * @package pers.yshy.medium.question78
 **/
public class question78 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        List<List<Integer>> res = null;

        res = s.subsets(new int[]{1, 2, 3});
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j)+"\t");
            }
            System.out.print("\n");
        }
        System.out.println();

        res = s.subsets(new int[]{1, 1, 2, 2, 3, 3});
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j)+"\t");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
