package stage_2.Api01.Day02.chapter05;

/*
    哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，模拟出来的地址并不是数据实际存储的物理地址）
    在Object类有一个方法，可以获取对象的哈希值
    int	hashCode()返回该对象的哈希码值。
    hashCode方法源码：public native int hashCode();
        native：代表该方法调用的是本地操作系统的方法
 */

public class t_HashCode_248 {
    public static void main(String[] args) {
        // Person类继承了Object类，所以可以使用Object类的hashCode方法
        t_Person_249 p1 = new t_Person_249();
        int h1 = p1.hashCode();
        System.out.println(h1); // 1712536284 | 666

        t_Person_249 p2 = new t_Person_249();
        int h2 = p2.hashCode();
        System.out.println(h2); // 2080166188 | 666

        /*
            toString方法源码：
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(p1); // stage_2.Api01.Day02.chapter05.t_Person_249@66133adc | stage_2.Api01.Day02.chapter05.t_Person_249@29a
        System.out.println(p2); // stage_2.Api01.Day02.chapter05.t_Person_249@7bfcd12c | stage_2.Api01.Day02.chapter05.t_Person_249@29a
        System.out.println(p1 == p2); // false

        /*
            String类的哈希值
                String类重写了Object类的hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode()); // 96354
        System.out.println(s2.hashCode()); // 96354
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        System.out.println("------------------------");
        System.out.println("洪泽飞".hashCode());
        System.out.println("张雯蔚".hashCode());


    }
}
