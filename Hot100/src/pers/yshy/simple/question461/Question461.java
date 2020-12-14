package pers.yshy.simple.question461;

/**
 * 461.汉明距离
 * @Author:ysy
 * @Date:2020/12/9
 * @Package:pers.yshy.simple.question461
 **/
public class Question461 {

    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int res = s.hammingDistance(1,4);
        System.out.println(res);

        res = s.hammingDistance(3,4);
        System.out.println(res);

        res = s.hammingDistance(3,5);
        System.out.println(res);
    }

}
