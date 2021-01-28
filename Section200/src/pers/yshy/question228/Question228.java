package pers.yshy.question228;

import java.util.List;

/**
 * 228. 汇总区间
 * @author ysy
 * @date 2021/1/28
 * @package pers.yshy.question228
 **/
public class Question228 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        List<String> res = null;

        res = s.summaryRanges(new int[]{0,1,2,4,5,7});
        for(String str : res){
            System.out.print(str+"\t");
        }
        System.out.println();

        res = s.summaryRanges(new int[]{0,2,3,4,6,8,9});
        for(String str : res){
            System.out.print(str+"\t");
        }
        System.out.println();

        res = s.summaryRanges(new int[]{});
        for(String str : res){
            System.out.print(str+"\t");
        }
        System.out.println();

        res = s.summaryRanges(new int[]{-1});
        for(String str : res){
            System.out.print(str+"\t");
        }
        System.out.println();

        res = s.summaryRanges(new int[]{0});
        for(String str : res){
            System.out.print(str+"\t");
        }
        System.out.println();

        res = s.summaryRanges(new int[]{1,3,5,7,9});
        for(String str : res){
            System.out.print(str+"\t");
        }
        System.out.println();
    }
}
