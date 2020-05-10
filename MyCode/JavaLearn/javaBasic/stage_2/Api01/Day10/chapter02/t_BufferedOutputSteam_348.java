package Api01.Day10.chapter02;

/*
    java.io.BufferedOutputStream extends OutputStream
    BufferedOutputStream：字节缓冲输出流

    继承自父类的共性成员的方法：
        public void close() :关闭此输出流并释放与此流相关联的任何系统资源。
        public void flush() :刷新此输出流并强制任何缓冲的输出字节被写出。
        public void write(byte[] b) :将 b.length字节从指定的字节数组写入此输出流。
        public void write(byte[] b, int off, int len) :从指定的字节数组写入 len字节,从偏移量 off开始输出到此输出流。
        public abstract void write(int b) :将指定的字节输出流。

    构造方法：
        BufferOutputStream(OutputStream out)创建一个新的缓冲输出流以将数据写入指定的底层输出流
        BufferOutputStream(OutputStream out, int size)创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流
        参数：
            OutputStream out：字节输出流，可以传递FileOutputStream，缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的使用效率
            int size：指定缓冲流内部缓冲区的大小，不指定就默认大小
    使用步骤：
        1、创建一个FIleOutputStream对象，构造方法中绑定要出的目的地
        2、创建缓冲流BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FIleOutputStream对象效率
        3、使用BufferedOutputStream对象中的方法write，把数据写入到内部的缓冲区中
        4、使用BufferedOutputStream对象中的方法flush，把内部缓冲区中的数据刷新到文件中
        5、释放资源（先调用flush刷新数据，第四步可以省略）
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class t_BufferedOutputSteam_348 {
    public static void main(String[] args) throws IOException {
        // 1、创建一个FIleOutputStream对象，构造方法中绑定要出的目的地
        FileOutputStream fos = new FileOutputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter02/test1.txt");

        // 2、创建缓冲流BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FIleOutputStream对象效率
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        // 3、使用BufferedOutputStream对象中的方法write，把数据写入到内部的缓冲区中
        bos.write("老八秘制小汉堡～秘制秘制小汉堡".getBytes());

        // 4、使用BufferedOutputStream对象中的方法flush，把内部缓冲区中的数据刷新到文件中
        bos.flush();

        // 5、释放资源
        bos.close();

    }
}
