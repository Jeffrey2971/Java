package Api01.Day08.chapter02;

/*
测试类：
包含main方法，程序执行的入口，启动程序
创建包子对象
创建包子铺线程，开启，生产包子
创建吃货线程，开启，吃包子
 */

public class t_Demo_306 {
    public static void main(String[] args) {
        // 创建包子对象
        t_BaoZi_303 bz = new t_BaoZi_303();
        // 使用匿名对象创建包子铺线程，开启，生产包子
        new t_BzoZiPu_304(bz).start();
        // 使用匿名对象创建吃货线程，开启，吃包子
        new t_ChiHuo_305(bz).start();
    }
}
