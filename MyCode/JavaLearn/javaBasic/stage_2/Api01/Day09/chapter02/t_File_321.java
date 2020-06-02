package Api01.Day09.chapter02;

/*
File类判断文件/文件夹方法
    public boolean exists() :此File表示的文件或目录是否实际存在。
    public boolean isDirectory() :此File表示的是否为目录。
    public boolean isFile() :此File表示的是否为文件。
 */

import java.io.File;

public class t_File_321 {
    public static void main(String[] args) {
        // show01();
        show02();
    }


    /*
        public boolean isDirectory() :此File表示的是否为目录。
            用于判断构造方法中给定的路径是否以文件夹结尾
                是：返回true
                否：返回false
        public boolean isFile() :此File表示的是否为文件。
            用于判断构造方法中给定的路径是否以文件结尾
                是：返回true
                否：返回false
        注意事项：
            电脑的硬盘中只有文件/文件夹，两个方法是互斥的
            两个方法的使用前提，路径必须是存在的，否则都返回false
     */
    private static void show02() {
        File f1 = new File("/home/jeffrey/IdeaProjectsS");

        // 不存在就没有必要获取
        if (f1.exists()) {
            System.out.println(f1.isDirectory()); // false：路径不存在
            System.out.println(f1.isFile()); // false：路径不存在
        }

        File f2 = new File("/home/jeffrey/IdeaProjects");
        if (f2.exists()) {
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }

        File f3 = new File("/home/jeffrey/IdeaProjects/JavaLearn/README.md");
        if (f3.exists()) {
            System.out.println(f3.isDirectory());
            System.out.println(f3.isFile());
        }

    }


    /*
        public boolean exists() :此File表示的文件或目录是否实际存在。
        用于判断构造方法中的路径是否存在
            存在：true
            不存在：false
     */
    private static void show01() {
        File f1 = new File("/home/jeffrey/IdeaProjects");
        System.out.println(f1.exists()); // true：路径存在

        File f2 = new File("/home/jeffrey/IdeaProjectsS");
        System.out.println(f2.exists()); // false：路径不存在

        File f3 = new File("README.md"); // 相对路径
        System.out.println(f3.exists()); // true：相对路径下存在

        File f4 = new File("a.txt"); //
        System.out.println(f4.exists()); // false：相对路径下不存在

    }
}
