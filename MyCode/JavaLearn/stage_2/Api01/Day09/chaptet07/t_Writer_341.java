package Api01.Day09.chaptet07;

/*
    字符输出流写数据的其他方法：
        void write(char[] cbuf) 写入字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        void write(String str) 写入字符串。
        void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */

import java.io.FileWriter;
import java.io.IOException;

public class t_Writer_341 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chaptet07/test2.txt");
        char[] cs = {'A', 'B', 'C', 'D', 'E'};
        // void write(char[] cbuf) 写入字符数组。
        fw.write(cs);

        // abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        fw.write(cs,1,3); // BCD

        // void write(String str) 写入字符串。
        fw.write("张雯蔚");

        // void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        fw.write("玮海琼",1,2);
        fw.close();
    }
}
