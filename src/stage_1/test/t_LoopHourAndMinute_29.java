package stage_1.test;
/*
循环嵌套
练习：打印出小时分钟秒
 */
public class t_LoopHourAndMinute_29 {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    System.out.println("现在是：" + hour + "时" + minute + "分" + second + "秒");
                }
            }
        }
    }
}
