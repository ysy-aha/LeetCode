package pers.ysy.section1100.question1185;

/**
 * 1971-1-1 是星期五，日期计算从 4 开始
 * 循环判断 1971 年到 输入时间的日期，然后 %
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.5 MB, 在所有 Java 提交中击败了93.56%的用户
 *
 * @Author ysy
 * @Date 2020/11/3
 **/
public class Solution01 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int days = 4;
        // 循环计算自 1971年的日期时间
        for (int i = 1971; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                days += 366;
            } else {
                days += 365;
            }
        }
        // 平年月份日期
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            months[1] = 29;
        }
        // 循环计算当前月份日期
        for(int i=0; i<month-1; i++){
            days += months[i];
        }
        day = (days + day) % 7;
        return week[day];
    }
}
