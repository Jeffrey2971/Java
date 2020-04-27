package stage_2.Api01.Day04.chapter01;

/*
    throws关键字：异常处理的第一种方式，交给别人处理
    作用：
        当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象，可以使用throws关键字来处理异常对象，
        会把异常对象声明抛出给方法的调用者处理（自己不处理，给别人处理），最终交给JVM处理-->中断处理
        
    使用格式：在方法声明时使用
        修饰符 返回值类型 方法名（参数列表） throws aaaException("message"), bbbException("message"){
            throw new aaaException("message")
            throw new bbbException("message")
            ...
        }
     
    注意事项：
    1、throws关键字必须写在方法声明处
    2、throws关键字后面必须声明异常必须是Exception或者是Exception的子类
    3、如果抛出了多个异常对象，那么throws后面必须也声明多个异常，如果抛出的多个异常对象有字符类关系，那么直接声明父类异常即可
    4、调用了一个声明抛出异常的方法，就必须处理声明的异常，
        要么继续使用throws声明抛出，将异常交给方法的调用者，最终交给JVM处理，
        要么try-catch自己处理异常
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class t_Throws_271 {

    /*
        FileNotFoundException extends IOException extends Exception
     */
    public static void main(String[] args) throws IOException {
        readFile("/home/jeffrey/test.tx");
        System.out.println("后续代码"); // 缺陷，后面的代码不会被执行
    }

    /*
        定义一个方法，对传递的文件路径进行合法性的判断
        如果路径不是“/home/jeffrey/in.txt”，那么将抛出文件找不到的异常对象，告知方法的调用者
        注意：FileNotFoundException是编译异常，抛出了编译异常就必须处理这个异常
        可以使用throws继续声明抛出FileNotFoundException这个异常对象，让方法的调用者处理
     */
    public static void readFile(String fileName) throws IOException {
        if (!fileName.equals("/home/jeffrey/in.txt")) {
            throw new FileNotFoundException("传递的文件路径不是/home/jeffrey/in.txt");
        }

        /*
            如果传递的路径不是.txt结尾，那么将抛出异常IO异常对象，告知方法调用者文件的后缀名错误
         */
        if (!fileName.endsWith(".txt")) {
            throw new IOException("后缀名错误");

        }
        System.out.println("Ok");
    }
}
