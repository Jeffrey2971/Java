package Api01.Day09.chapter08;

/*
    在JDK1.7之间try catch finally 处理流中的异常
    格式：
        try{
            可能会产生异常的代码
        }catch(异常类的变量){
            异常的处理逻辑
        }finally{
            一定会执行的代码
            资源释放
        }
 */

import java.io.FileWriter;
import java.io.IOException;

public class t_tryCatch_343 {
    public static void main(String[] args) {
        // 提高变量fw的作用域，让finally可以使用
        // 变量在定义的时候，可以没有值，但是使用的时候必须有值
        // try语句中的代码块执行失败，fw没有值，fw.close()就会报错

        FileWriter fw = null;
        try {
            fw = new FileWriter("/home/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chapter08/test1.txt", true);
            for (int i = 0; i < 20; i++) {
                fw.write("\n洪景瀚" + i);
            }

        } catch (IOException e) {
            System.out.println(e);

        } finally {
            // 一定会指定的代码
            // 如果对象创建失败，fw的默认值是null，null是不能调用方法的，会抛出空指针异常，需要增加一个判断，不是null再把资源释放
            if (fw != null) {
                try {
                    // fw.close()方法声明抛出IOException异常对象，所以就得处理这个对象，要么throws，要么try-catch
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
