package Api01.Day09.chapter04;

/*
    java.io.OutputStream（字节输出流）：
        此抽象类是表示输出字节流的所有类的超类（父类）
    定义了一些子类共性的成员方法
        public void close() :关闭此输出流并释放与此流相关联的任何系统资源。
        public void flush() :刷新此输出流并强制任何缓冲的输出字节被写出。
        public void write(byte[] b) :将 b.length字节从指定的字节数组写入此输出流。
        public void write(byte[] b, int off, int len) :从指定的字节数组写入 len字节,从偏移量 off开始输出到此输出流。
        public abstract void write(int b) :将指定的字节输出流。
    java.io.FileOutputSteam extends OutputStream
        FileOutputSteam：文件字节输出流
        作用：把内存中的数据写入到硬盘的文件中

        构造方法：
            public FileOutputStream(String name) : 创建文件输出流以指定的名称写入文件。
            public FileOutputStream(File file) :创建文件输出流以写入由指定的 File对象表示的文件。
            参数：写入数据的目的地
                String name：目的地是一个文件路径
                File file：目的地是一个文件
            构造方法的作用：
                1、创建一个FileOutputStream对象
                2、会根据构造方法中传递的文件/文件路径，创建一个空的文件
                3、会把FileOutputStream对象指向创建好的文件
 */

public class t_OutputStream_331 {
}
