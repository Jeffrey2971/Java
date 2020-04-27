package Api01.Day10.chapter03;

/*
    java.io.BufferedReader extends Reader
    继承自父类的共性的成员方法：
        int read() 从输入流中读取数据的下一个字节
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区的数组b中
        void close() 关闭此输入流并释放与该流关联的所有系统资源
    构造方法：
        BufferedReader(Reader in)创建一个使用默认大小输入流缓冲区的缓冲字符输入流
        BufferedReader(Reader in, int sz)创建一个使用指定大小输入流缓冲区的缓冲字符输入流
        参数：
            Reader in：字符输入流，可以传递FileReader，缓冲流会给FileReader增加一个缓冲区，提高FileReader的读取效率
            int sz：
        特有的成员方法：
            String readLine()：读取一行文本，读取一行数据
            行的终止符号：通过以下列字符之一即可默认某行为已终止：换行\n回车\r或回车后直接跟着换行
        返回值：
            包含该行内容的字符串，不包含任何终止符，如果已达到末尾流，则返回null
     使用步骤：
        1、创建字符缓冲输入流对象，构造方法中传递字符输入流
        2、使用字符缓冲输入流对象的方法read/readLine读取文本
        3、释放资源

 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class t__BufferedReader_339 {
    public static void main(String[] args) throws IOException {
        // 1、创建字符缓冲输入流对象，构造方法中传递字符输入流
        BufferedReader br = new BufferedReader(new FileReader("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter03/test1.txt"));
        // 2、使用字符缓冲输入流对象的方法read/readLine读取文本
        /*String line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line); // null*/

        /*
            以上代码是一个重复的过程，所以可以使用循环优化
            不清楚文件中有多少行的数据，所以使用while循环
            while循环的结束条件，读取到null结束
         */
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }


        // 3、释放资源
        br.close();
    }
}
