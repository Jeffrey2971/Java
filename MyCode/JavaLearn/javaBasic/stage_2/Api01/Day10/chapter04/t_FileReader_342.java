package Api01.Day10.chapter04;

/*
    FileReader可以读取默认编码格式（utf-8）的文件
    FileReader读取系统默认编码（中文GBK）会产生乱码���

 */

import java.io.FileReader;
import java.io.IOException;

public class t_FileReader_342 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter04/GBK格式.txt");
        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char)len);
        }
        fr.close();
    }
}
