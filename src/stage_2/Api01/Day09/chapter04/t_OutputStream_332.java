package Api01.Day09.chapter04;

/*
    一次写多个字节的方法：
        public void write(byte[] b) :将 b.length字节从指定的字节数组写入此输出流。
        public void write(byte[] b, int off, int len) :从指定的字节数组写入 len字节,从偏移量 off开始输出到此输出流。
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class t_OutputStream_332 {
    public static void main(String[] args) throws IOException {
        // 创建FileOutputStream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chapter04/test2.txt"));

        // 调用FileOutputStream对象中的方法write，把数据写入到文件中
        fos.write(49);
        fos.write(48);
        fos.write(48);

        /*
            public void write(byte[] b, int off, int len) :从指定的字节数组写入 len字节,从偏移量 off开始输出到此输出流。
            一次写多个字节：
                如果写的第一个字节是正数（0-127），显示的时候会查询ASCII码表
                如果写的第一个字节是负数，那么第一个字节和第二个字节，两个字节组成一个中文显示，查询系统默认码表（GBK）
         */
        // byte[] bytes = {65, 66, 67, 68, 69};
        byte[] bytes = {-65, -66, -67, 68, 69};
        fos.write(bytes); // ABCDE

        /*
            public void write(byte[] b, int off, int len)：把字节数组的一部分写入到文件中
                int off：数组的开始索引
                int len：写几个字节
         */
        fos.write(bytes, 1, 2);

        /*
            写入字符串的方法：可以使用String类中的方法把字符串转换为字节数组
                byte[] getBytes() 把字符串转换为字节数组
         */
        byte[] bytes1 = "张雯蔚".getBytes();
        System.out.println(Arrays.toString(bytes1)); // [-27, -68, -96, -23, -101, -81, -24, -108, -102]
        fos.write(bytes1);
        // 释放资源
        fos.close();
    }
}
