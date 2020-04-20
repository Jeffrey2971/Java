package stage_2.Api01.Day04.chapter01;

import java.io.IOException;

/*
finally代码块

格式：
    try{
        // 可能产生异常的代码
    }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
        // 异常的处理逻辑，产生异常对象之后，怎么处理异常对象，一般在工作中，会把异常信息记录到日志中
    }
    ...
    catch(异常类名 变量名){
        // ...
    } finally {
        // 这部分代码不论是否出现异常都会被执行
    }

注意事项：
    1、finally不能单独使用，必须和try一起使用
    2、finally一般用于资源释放（资源回收），不论程序是否出现异常，最后都要资源释放（IO）
    3、finally关键字不需要一定和try一起使用，但是catch一定要和try一起使用


 */

public class t_TryCatchFinally_274 {
    public static void main(String[] args) {
        try {
            // 可能会产生异常的代码
            readFile("/home/jeffrey/test.tx");
            System.out.println("楼上出错我将不会执行");
        } catch (IOException e) {
            // 异常的处理逻辑
            e.printStackTrace();
        } finally {
            // 不论是否出现异常都会被执行
            System.out.println("资源释放");
        }
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
