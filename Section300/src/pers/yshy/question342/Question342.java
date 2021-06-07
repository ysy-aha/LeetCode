package src.pers.yshy.question342;

/**
 * @author ysy
 * @date 2021/6/7
 */
public class Question342 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		boolean res = s.isPowerOfFour(16);
		System.out.println(res);

		res = s.isPowerOfFour(5);
		System.out.println(res);

		res = s.isPowerOfFour(1);
		System.out.println(res);
	}
}
/*
4 0100
1011

1011

 */