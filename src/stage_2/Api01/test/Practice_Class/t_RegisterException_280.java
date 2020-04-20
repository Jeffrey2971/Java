package stage_2.Api01.test.Practice_Class;

/*
自定义异常类：
    Java提供的异常类不够使用，需要自己定义一些异常类
格式：
    public class XXXException extends Exception | RuntimeException{
        // 添加一个空参数的构造方法
        // 添加一个带异常信息的构造方法
    }
注意事项：
    1、自定义异常类一般都是以Exception结尾，说明该类是一个异常类
    2、自定义异常类必须继承自Exception或者RuntimeException
        继承Exception：那么自定义的异常类就是一个编译期异常，如果方法内部抛出了编译期异常，就必须处理这个异常，要么throws，要么try...catch
        继承RuntimeException：那么自定义的异常类就是一个运行期异常，无需处理，交给虚拟机处理（中断处理）
 */

public class t_RegisterException_280 extends /*Exception*/ RuntimeException{
    // 添加一个空参数构造方法
    public t_RegisterException_280(){
        super();
    }

    /*
    添加一个带异常信息的构造方法
    查看源码发现所有的异常类都会有一个带异常信息的构造方法，方法内部会调用父类，带异常信息的构造方法让父类来处理这个异常信息
     */
    public t_RegisterException_280(String message){
        super(message);
    }
}
