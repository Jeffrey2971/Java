package Api01.Day09.chaptet07;

/*
    续写和换行
    续写，追加写：使用两个参数的构造方法
        FileWriter(String filename, boolean append)
        FileWriter(File file, boolean append)
        参数：
            String filename, File file：写入数据的目的地
            boolean append：续写开关 true：不会创建新的文件覆盖源文件，可以续写；false：创建新的文件覆盖源文件
        换行：换行符
            Windows：\r\n
            Linux：\n
            Mac：/r
 */

import java.io.FileWriter;
import java.io.IOException;

public class t_Writer_342 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chaptet07/test3.txt", true);
        for (int i = 0; i < 20; i++) {
            fw.write("\n洪景瀚" + i);

        }
        fw.close();

    }
}
