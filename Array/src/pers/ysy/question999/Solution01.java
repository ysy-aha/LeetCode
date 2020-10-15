package pers.ysy.question999;

/**
 * 先循环找到所有不为空的位置，记录他的坐标，然后四个方向循环判断是否存在可以捕获的卒
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.7 MB, 在所有 Java 提交中击败了99.29%的用户
 * @Author ysy
 * @Date 2020/10/15
 **/
public class Solution01 {
    public int numRookCaptures(char[][] board) {
        // 车的位置数组
        int[] position = new int[2];
        // 循环获取车的位置
        out:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // 获取位置之后直接跳出循环
                if (board[i][j] == 'R') {
                    position[0] = i;
                    position[1] = j;
                    break out;
                }
            }
        }
        // 找到的卒的数量
        int count = 0;
        // 向上找
        int x = position[0];
        while (x >= 0) {
            if (board[x][position[1]] == 'p') {
                count++;
                break;
            } else if (board[x][position[1]] == 'B') {
                break;
            }
            x--;
        }
        // 向下找
        x = position[0];
        while (x < board.length) {
            if (board[x][position[1]] == 'p') {
                count++;
                break;
            } else if (board[x][position[1]] == 'B') {
                break;
            }
            x++;
        }
        // 向左找
        int y = position[1];
        while(y >= 0){
            if(board[position[0]][y] == 'p'){
                count++;
                break;
            }else if(board[position[0]][y] == 'B'){
                break;
            }
            y--;
        }
        // 向右找
        y = position[1];
        while(y < board[position[0]].length){
            if(board[position[0]][y] == 'p'){
                count++;
                break;
            }else if(board[position[0]][y] == 'B'){
                break;
            }
            y++;
        }
        return count;
    }
}
