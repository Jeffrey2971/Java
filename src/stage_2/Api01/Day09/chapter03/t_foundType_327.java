package Api01.Day09.chapter03;

/*
    联系：
        递归打印多级目录，找到指定类型的文件
        只要.pdf结尾的文件
 */

import java.io.File;

public class t_foundType_327 {
    public static void main(String[] args) {
        File file = new File("/home/jeffrey/JavaLearn");
        getTypeFile(file);
    }

    public static void getTypeFile(File dir) {
//        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            // f是一个文件夹，则继续遍历这个文件夹
            if (f.isDirectory()) {
                getTypeFile(f);
            } else {
                /*
                    只要pdf类型的文件
                        1、把File对象f转换为字符串对象
                            String name = f.getName();
                            String path = f.getPath();
                            String str = f.toString();
                 */
                /*String name = f.getName();
                String path = f.getPath();
                String str = f.toString();
                str = str.toLowerCase();

                调用String类中的方法endsWith判断字符串是否以pdf结尾
                if (str.endsWith(".pdf")) {
                    System.out.println(f);
                }*/

                if (f.getName().toLowerCase().endsWith(".pdf")) {
                    System.out.println(f);
                }
            }
        }
    }
}