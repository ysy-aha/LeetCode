package pers.yshy.medium.question46;

import java.util.List;

/**
 * 46. 全排列
 *
 * @author ysy
 * @date 2021/1/6
 * @package pers.yshy.medium.question46
 **/
public class question46 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        List<List<Integer>> res = null;

        res = s.permute(new int[]{1,2,3});
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j));
            }
            System.out.println();
        }

//        res = s.permute(new int[]{1,2,3,4});
//        for(int i=0; i<res.size(); i++){
//            for(int j=0; j<res.get(i).size(); j++){
//                System.out.print(res.get(i).get(j));
//            }
//            System.out.println();
//        }
//
//        res = s.permute(new int[]{1,2,3,5});
//        for(int i=0; i<res.size(); i++){
//            for(int j=0; j<res.get(i).size(); j++){
//                System.out.print(res.get(i).get(j));
//            }
//            System.out.println();
//        }
//
//        res = s.permute(new int[]{1});
//        for(int i=0; i<res.size(); i++){
//            for(int j=0; j<res.get(i).size(); j++){
//                System.out.print(res.get(i).get(j));
//            }
//            System.out.println();
//        }
//
//        res = s.permute(new int[]{});
//        for(int i=0; i<res.size(); i++){
//            for(int j=0; j<res.get(i).size(); j++){
//                System.out.print(res.get(i).get(j));
//            }
//            System.out.println();
//        }
    }
}
