package Api01.Day10.chapter04;

/*
    java.io.InputStreamReader extends Reader
    InputStreamReader：是字节流通向字符流的桥梁，他使用指定的charset读取字节并将其解码为字符（解码：把看不懂的变成能看懂的）

    继承自父类的成员方法：
        int read() 从输入流中读取数据的下一个字节
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区的数组b中
        void close() 关闭此输入流并释放与该流关联的所有系统资源
    构造方法：
        InputStreamReader(InputStream in)创建一个使用默认字符集的InputStreamReader
        InputStreamReader(InputStream in, String charsetName)创建一个使用指定字符集的InputStreamReader
        参数：
            InputStream in：字节输入流，用来读取文件中保存的字节
            String charsetName：指定的编码表名称，不区分大小写，可以是utf-8/UTF-8/GBK/gbk等...不指定默认使用utf-8
    使用步骤：
        1、创建对象InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        2、使用InputStreamReader对象中的方法read读取文件
        3、释放资源
    注意事项：
        构造方法中指定的编码表名称要和文件的编码相同，否则乱码
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class t_InputStreamReader_345 {
    public static void main(String[] args) throws IOException {
        read_utf_8();
    }

    /*
        使用InputStreamReader读取UTF-8格式的文件
     */
    private static void read_utf_8() throws IOException {
        // 1、创建对象InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter04/utf_8.txt"), "utf-8");
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter04/utf_8.txt"));
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter04/GBK格式.txt"), "UTF-8");
        // 2、使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while ((len = isr.read()) !=-1) {
            System.out.print((char)len);
        }
        isr.close();
    }
}
