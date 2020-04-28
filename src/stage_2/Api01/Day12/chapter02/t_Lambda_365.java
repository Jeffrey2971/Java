package Api01.Day12.chapter02;

/*
    使用Lambda优化日志案例：
        Lambda的特点：延迟加载
        lambda的使用前提：必须存在函数式接口
 */

public class t_Lambda_365 {
    // 定义一个显示日志的方法，方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int lever, t_MessageBuilder_366 mb) {
        // 对日志的等级进行判断，如果是一级则调用MessageBuilder接口中的builderMessage方法
        if (lever == 1) {
            System.out.println(mb.builderMessage());

        }
    }

    public static void main(String[] args) {
        // 定义三个日志信息
        String msg_1 = "Hello";
        String msg_2 = "World";
        String msg_3 = "Python";

        // 调用showLog方法，参数MessageBuilder是一个函数式接口，所以可以传递lambda表达式

        /*
            使用lambda表达式作为参数传递，仅仅是把参数传递到showLog方法中
            只有满足条件，日志的等级是一级才会调用接口MessageBuilder中的方法BuilderMessage才会进行字符串的拼接
            如果条件不满足，日志的等级不是一级，那么MessageBuilder接口中的方法BuilderMessage也不会执行
            所以拼接字符串的代码也不会执行，所以不会存在性能浪费
         */
        showLog(1, () -> {
            System.out.println("不满足条件，不执行");
            // 返回一个拼接好的字符串
            return msg_1 + msg_2 + msg_3;
        });
    }
}
