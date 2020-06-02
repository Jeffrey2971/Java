package Api01.Day09.chapter09;

/*
    JDK7的新特性
    在try的后面可以增加一个()，在括号中可以定义流对象
    那么这个流对象的作用域就在try中有效
    try中的代码执行完毕，会自动把流对象释放，不用写finally

    格式：
        try(定义流对象，定义流对象... ...){
            可能会产生异常的代码
        }catch(异常类的变量){
            异常的处理逻辑
        }
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class t_JDK7_345 {
    public static void main(String[] args) {
        try (// 1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
             FileInputStream fis = new FileInputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chapter05/README.md");
             // 2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
             FileOutputStream fos = new FileOutputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chapter09/README.md");
        ) {
            long s = System.currentTimeMillis();
            // 3、读取一个字节写入一个字节的方式，使用字节输入流对象中的方法read读取文件
            int len = 0;
            while ((len = fis.read()) != -1) {
                // 4、使用字节输出流对象中的方法write把读取到的字节写入到目的地的文件中
                fos.write(len);
            }

        } catch (IOException e) {
            System.out.println(e);

        }

    }
}
