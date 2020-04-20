package stage_2.Api01.Day01.chapter02.Calendar;

/*
    java.util.Calendar类：日历类
    calendar类是一个抽象类，里面提供了很多操作日历字段的方法（YEAR、MONTH、DAY_OF_MONTH、HOUR）
    calendar类是一个抽象类无法直接创建对象使用，里面有一个静态方法叫getInstance()，该方法返回了Calendar类的子类对象
 */

import java.util.Calendar;

public class t_Calendar_238 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // 多态
        System.out.println(c);
    }
}
