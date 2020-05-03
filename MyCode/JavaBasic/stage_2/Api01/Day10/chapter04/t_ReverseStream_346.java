package Api01.Day10.chapter04;

/*
    练习：转换文件编码，将GBK的文本文件转换为UTF-8编码的文本文件
    分析：
        1、创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK
        2、创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称UTF-8
        3、使用InputStreamReader对象中的方法read读取文件
        4、使用OutputStreamWriter对象中的方法write把读取的数据写入到文件中
        5、释放资源
 */

import java.io.*;

public class t_ReverseStream_346 {
    public static void main(String[] args) throws IOException {
        // 1、创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK
        InputStreamReader isr = new InputStreamReader(new FileInputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter04/GBK格式.txt"), "GBK");
        // 2、创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称UTF-8
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter04/我是utf_8.ttx"), "UTF-8");
        // 3、使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while ((len = isr.read()) !=-1) {
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
