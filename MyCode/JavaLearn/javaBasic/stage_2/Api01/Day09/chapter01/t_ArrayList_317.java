package Api01.Day09.chapter01;
/*
 * Lambda表达式：是可推导，可以省略
 * 凡是根据上下文推导出来的内容，都可以省略书写
 * 可以省略的内容：
 *   1、（参数列表）：括号中参数列表的数据类型，可以省略不谢
 *   2、（参数列表）：括号中的参数如果只有一个，那么类型和()都可以省略
 *   3、{一些代码}：如果{}中的代码只有一行，不论是否有返回值，都可以省略({},return,分号)
 *      注意：要省略{}，return，分号必须同时一起使用
 *      在JDK1.7之前，创建集合对象必须把前后的泛型都写上
 * */

import java.util.ArrayList;

public class t_ArrayList_317 {
    public static void main(String[] args) {
        // 在JDK1.7之前，创建集合对象必须把前后的泛型都写上
        ArrayList<String> list01 = new ArrayList<String>();
        // 在JDK1.7之后的版本，等号后面的泛型可以省略不写，因为后面的泛型可以根据前面的泛型推导出来
        ArrayList<String> list02 = new ArrayList<>();
    }
}
