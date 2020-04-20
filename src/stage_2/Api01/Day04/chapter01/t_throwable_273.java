package stage_2.Api01.Day04.chapter01;

/*
throwable类中定义了3个异常处理的方法：
    1、String getMessage() 返回此throwable的简短描述
    2、String toString() 返回此throwable的详细信息
    3、String printStaticTrace() JVM打印异常对象，默认此方法，打印异常信息是最全面的
 */

import java.io.IOException;

public class t_throwable_273 {
    public static void main(String[] args) {
        try {
            readFile("/home/jeffrey/test.tx");
        } catch (IOException e) { // try中抛出什么异常对象，catch就定义什么异常变量，用来接受这个异常对象
            // 常的处理逻辑，产生异常对象之后，怎么处理异常对象
            System.out.println("catch 传递的文件后缀名不是.txt");

            // System.out.println(e.getMessage()); catch 传递的文件后缀名不是.txt

            // System.out.println(e.toString()); 重写Object类的toString java.io.IOException: 后缀名错误

            /*java.io.IOException: 后缀名错误
            at stage_2.Api01.Day04.chapter01.t_throwable_273.readFile(t_throwable_273.java:30)
            at stage_2.Api01.Day04.chapter01.t_throwable_273.main(t_throwable_273.java:15)*/
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }

    /*
        如果传递的路径不是.txt结尾，那么将抛出异常IO异常对象，告知方法调用者文件的后缀名错误
     */
    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("后缀名错误");

        }
        System.out.println("Ok");
    }
}
