package Api01.Day09.chaptet07;

/*
    使用字节流读取中文
        1个中文
            GBK：占用两个字节
            UTF-8：占用三个字节
 */

import java.io.FileInputStream;
import java.io.IOException;

public class t_InputStream_337 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chaptet07/test.txt");
        int len = 0;
        while((len = fis.read()) !=-1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
