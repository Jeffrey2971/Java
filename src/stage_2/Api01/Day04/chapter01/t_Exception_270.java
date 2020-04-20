package stage_2.Api01.Day04.chapter01;

/*
    Object类中的静态方法
    public static<T> T requireNonNull(T obj)：查看指定引用对象不是null
    源码：
        public static <T> T requireNonNull(T obj) {
            if (obj == null)
                throw new NullPointerException();
            return obj;
        }

 */

import java.util.Objects;

public class t_Exception_270 {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
        // 对传递过来的参数进行合法性判断是否为空
        /*if(obj == null){
            throw new NullPointerException("空！");*/

        // Objects.requireNonNull(obj);
        /*
            public static <T> T requireNonNull(T obj, String message) {
            if (obj == null)
                throw new NullPointerException(message);
            return obj;
            }
         */
        Objects.requireNonNull(obj, "空空如也！");


    }
}
