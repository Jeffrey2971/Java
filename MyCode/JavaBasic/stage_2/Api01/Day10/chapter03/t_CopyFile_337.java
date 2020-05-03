package Api01.Day10.chapter03;

/*
文件复制：一读一写
    需明确：
        数据源：/home/jeffrey/in.txt
        目的地：/home/jeffrey/test/in.txt

文件复制的步骤：
    1、创建字节缓冲输入流对象，构造方法中传递字节输入流
    2、创建字节缓冲输出流对象，构造方法中传递字节输出流
    3、使用字节缓冲输入流对象中的方法read读取文件
    4、使用字节缓冲输出流对象中的方法write把读取的数据写入到内部缓冲区中
    5、释放资源（会先把缓冲区中的数据刷新到文件中）

效率测试：
        一次读写一个字节效率非常低（2057毫秒）
        使用数组缓冲读取多个字节效率高（132毫秒）
 */

import java.io.*;

public class t_CopyFile_337 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        // 1、创建字节缓冲输入流对象，构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/home/jeffrey/VmShare/内存对象图.bmp"));

        // 2、创建字节缓冲输出流对象，构造方法中传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter03/内存对象图.bmp"));

        // 3、使用字节缓冲输入流对象中的方法read读取文件
        // 读取一个字节写入一个字节的方式
        /*int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);

        }*/

        // 使用数组缓冲读取多个字节写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);

        }

        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println("共耗时：" + (e-s) + "毫秒");

    }
}
