package Api01.Day09.chapter09;

/*
    JDK9的新特性
        try的前面可以定义流对象
        在try后面的()中可以直接引入流对象的名称（变量名）
        在try代码块执行完毕之后，流对象也可以释放掉，不用写finally

        格式：
            A a = new A();
            B b = new B();
            try(a, b){
                可能会出现异常的代码
            }catch(异常类 变量名){
                异常的处理逻辑
            }
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class t_JDK9_346 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        // 1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chapter05/README.md");
        // 2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chapter06/README.md");
        // 3、读取一个字节写入一个字节的方式，使用字节输入流对象中的方法read读取文件
        try (fis; fos) {
            int len = 0;
            while ((len = fis.read()) != -1) {
                // 4、使用字节输出流对象中的方法write把读取到的字节写入到目的地的文件中
                fos.write(len);
            }
        } catch (IOException e) {
            System.out.println(e);

        }
        /*fos.write(1);*/



    }
}
