package src.pers.yshy.question342;

/**
 * 炒的
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.5 MB, 在所有 Java 提交中击败了33.85%的用户
 *
 * @author ysy
 * @date 2021/6/7
 */
public class Solution01 {
	public boolean isPowerOfFour(int n) {
		return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
	}
}

/*
4 16 >> 2 10000

 */
