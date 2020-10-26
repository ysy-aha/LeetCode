package pers.ysy.section1100.question1128;

/**
 * （超时）循环套循环，然后两个数组进行比较，大的比大的，小的比小的
 *
 * @Author ysy
 * @Date 2020/10/26
 **/
public class Solution01 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        for(int i=0; i<dominoes.length-1; i++){
            for(int j=i+1; j<dominoes.length; j++){
                if(Math.max(dominoes[i][0], dominoes[i][1]) == Math.max(dominoes[j][0], dominoes[j][1])){
                    if(Math.min(dominoes[i][0], dominoes[i][1]) == Math.min(dominoes[j][0], dominoes[j][1])){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
