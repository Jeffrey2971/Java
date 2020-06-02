package Api01.Day01.chapter02.Date;

/*
    java.util.Date：表示日期和时间的类
    类Date表示特定的瞬间，精确到毫秒
    毫秒：千分之一秒 1000毫秒等于一秒
    特定的瞬间：一个时间点，一刹那时间
    2088-08-08 09:55:33:555 瞬间
    毫秒值的作用：可以对时间和日期进行计算
    2099-01-03 到 2088-01-01 中间一共有多少天
    可以把日期转换为毫秒进行计算，计算完毕后再把毫秒转换为日期

    把日期转换为毫秒：
        当前的日期：2088-01-01
        时间原点（0毫秒）：2020年04月16日00:00:00（英国格林威治）
        就是计算当前日期到时间原点之间一共经历了多少毫秒(～1587037736141L)
    把毫秒转换为日期：
       1天 = 24*24*60 = 86400秒 = 86400 × 1000毫秒
    注意：
        中国属于东八区，会把时间增加八个小时
        2020年04月16日08:00:00
 */

public class t_Date_235 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // 获取当前系统时间一共到2020年一月一日 00;：00:00经历了多少毫秒

    }
}

