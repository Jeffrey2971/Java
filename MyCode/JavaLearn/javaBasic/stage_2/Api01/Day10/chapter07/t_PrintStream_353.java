package Api01.Day10.chapter07;

/*
    可以改变输出语句的目的地（打印流的流向）
    输出语句默认在控制台输出
    使用System.setOut方法改变输出语句的目的地改为参数参数中传递的打印流的目的地
        static void setOut(PrintStream out)重新分配标准输出流
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class t_PrintStream_353 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出");
        PrintStream ps = new PrintStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter07/目的地是打印流.txt");
        System.setOut(ps); // 把输出语句的目的地改变为打印流的目的地
        System.out.println("我在打印流的目的地中输出");
        ps.close();
    }
}
