package Api01.Day09.chapter06;

/*
    文件复制：一读一写
    需明确：
        数据源：/home/jeffrey/test.txt
        目的地：/home/jeffrey/test/test.txt
    文件复制的步骤：
        1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
        2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
        3、使用字节输入流对象中的方法read读取文件
        4、使用字节输出流对象中的方法write把读取到的字节写入到目的地的文件中
        5、释放资源（先关闭写的后关闭读的，如果写完了肯定就读取完毕了）
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class t_CopyFile_336 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        // 1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chapter05/README.md");
        // 2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chapter06/README.md");
        // 3、读取一个字节写入一个字节的方式，使用字节输入流对象中的方法read读取文件
        /*int len = 0;
        while ((len = fis.read())!=-1){
            // 4、使用字节输出流对象中的方法write把读取到的字节写入到目的地的文件中
            fos.write(len);
        }*/

        // 使用数组缓冲读取多个字节写入多个字节
        byte[] bytes = new byte[1024];
        // 3、使用字节输入流对象中的方法read读取文件
        int len = 0; // 每次读取的有效字节个数
        while ((len = fis.read(bytes)) != -1) {
            // 4、使用字节输出流对象中的方法write把读取到的字节写入到目的地的文件中
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("共耗时：" + (e-s) + "毫秒");


    }
}
