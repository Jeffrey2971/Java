package stage_2.Api01.Day01.chapter02.Calendar;

/*
    Calendar类的常用成员方法：
        public int get(int field)：返回给定日历字段的值
        public void set(int field, int value)：将给定的日历字段设置为给定值
        public abstract void add(int field, int amount)：根据日历规则，为给定的日历字段添加或减去指定的时间量
        public Date getTime()：返回一个表示此calendar时间值（从历元到现在的毫秒值偏量）的date对象
    成员方法的参数：
        int field：日历类的字段，可以使用calendar类的静态成员变量获取
            public static final int YEAR = 1; 年
            public static final int MONTH = 2; 月
            public static final int DATE = 5;  月中的某一天
            public static final int DAY_OF_MONTH = 5; 月中的某一天
            public static final int HOUR = 10; 时
            public static final int MINUTE = 12; 分
            public static final int SECOND = 13; 秒

 */

import java.util.Calendar;
import java.util.Date;

public class t_Calendar_239 {
    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
        demo04();
    }


    /*
        public Date getTime()：返回一个表示此calendar时间值（从历元到现在的毫秒值偏量）的date对象
        把日历对象，转换为日期对象

     */
    private static void demo04() {
        // 使用getInstance方法获取calendar
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }


    /*
        public abstract void add(int field, int amount)：根据日历规则，为给定的日历字段添加或减去指定的时间量
        把指定的字段增加或减少指定的值
        参数：
            1、int field：传递指定的字段（YEAR，MONTH...）
            2、int amount：增加或减少指定的值
                整数：增加
                负数：减少

     */
    private static void demo03() {
        // 使用getInstance方法获取calendar
        Calendar c = Calendar.getInstance();

        // 增加两年
        c.add(Calendar.YEAR, 2);

        // 把月份减少三个月
        c.add(Calendar.MONTH, -3);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH); // 西方的月份是0-11，东方的月份1-12，所以四月 --> 三月
        int day = c.get(Calendar.DAY_OF_MONTH); // 月中的某一天
        System.out.println(year);
        System.out.println(month + 1);
        System.out.println(day);
    }


    /*
        public void set(int field, int value)：将给定的日历字段设置为给定值
        参数：
            1、int field：传递指定的字段（YEAR，MONTH...）
            2、int value：给指定字段设置的值
     */
    private static void demo02() {
        // 使用getInstance方法获取calendar
        Calendar c = Calendar.getInstance();

        // 设置年为9999年
        c.set(Calendar.YEAR, 9999);

        // 设置月为9月
        c.set(Calendar.MONTH, 9);

        // 设置日为9日
        c.set(Calendar.DATE, 9);

        // 同时设置年月日，可以使用set的重载方法
        c.set(8888, 7, 8);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH); // 西方的月份是0-11，东方的月份1-12，所以四月 --> 三月
        int day = c.get(Calendar.DAY_OF_MONTH); // 月中的某一天
        System.out.println(year);
        System.out.println(month + 1);
        System.out.println(day);
    }

    /*
        public int get（int field)：返回给定日历字段的值
        参数：传递指定的字段（YEAR，MONTH...）
        返回值：日历字段代表的具体的值
     */
    private static void demo01() {
        // 使用getInstance方法获取calendar
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH); // 西方的月份是0-11，东方的月份1-12，所以四月 --> 三月
        int day = c.get(Calendar.DAY_OF_MONTH); // 月中的某一天
        System.out.println(year);
        System.out.println(month + 1);
        System.out.println(day);
    }
}
