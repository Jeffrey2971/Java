package Api01.Day09.chaptet07;

/*
    flush方法和close方法的区别
        flush：刷新缓冲区，流对象可以继续使用
        close：先刷新缓冲区，然后通知系统释放资源，流对象不可再被使用
 */

import java.io.FileWriter;
import java.io.IOException;

public class t_CloseAndFlush_340 {
    public static void main(String[] args) throws IOException {
        // 1、创建一个FileReader对象，构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chaptet07/test1.txt");
        // 2、使用FileReader中的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）
        // void write(int c) 写入单个字符。
        fw.write(99);
        // 3、使用FileReader中的方法flush，把内存缓冲区中的数据，刷新到文件中
        fw.flush();
        fw.write(100); // 刷新之后，流可以继续使用
        // 4、释放资源（会先把内存缓冲区中的数据刷新到文件中）
        fw.close();
        fw.write(101); // close方法之后流已经关闭了并从内存中消失，所以流不能再使用
    }
}
