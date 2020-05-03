package Api01.Day09.chapter02;

/*
File类获取功能方法
    public String getAbsolutePath() :返回此File的绝对路径名字符串。
    public String getPath() :将此File转换为路径名字符串。
    public String getName() :返回由此File表示的文件或目录的名称。
    public long length() :返回由此File表示的文件的长度。
 */

import java.io.File;

public class t_File_320 {
    public static void main(String[] args) {
//        show01(); // getAbsolutePath()
//        show02(); // getPath()
//        show03(); // getName()
        show04(); // length()
    }


    /*
        public long length() :返回由此File表示的文件的长度。
        获取的是构造方法指向文件的大小，以字节为单位
        注意：
            文件夹是没有大小概念的，所以不能获取文件夹的大小
            如果构造方法中给出的路径不存在，那么length方法返回0
     */
    private static void show04() {
        File f1 = new File("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chapter02/README.md");
        long l1 = f1.length();
        System.out.println(l1); // 39 字节

        File f2 = new File("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chapter02/README2.md");
        System.out.println(f2.length()); // ，如果给定的目标不存在则返回0

        File f3 = new File("/home/jeffrey/JavaLearn");
        System.out.println(f3.length());



    }


    /*
        public String getName() :返回由此File表示的文件或目录的名称。
        获取的就是构造方法传递路径的结尾部分（文件/文件夹）
     */
    private static void show03() {
        File f1 = new File("/home/jeffrey/IdeaProjects/a.txt");
        String name1 = f1.getName(); // a.txt
        System.out.println(name1);

        File f2 = new File("/home/jeffrey/IdeaProjects");
        String name2 = f2.getName();
        System.out.println(name2); // IdeaProjects
    }


    /*
        public String getPath() :将此File转换为路径名字符串。
        获取的是构造方法中传递的路径

        toString方法调用的就是getPath方法
        源码：
            public String getPath() {
            return path;
    }

     */
    private static void show02() {
        File f1 = new File("/home/jeffrey/IdeaProjects/a.txt");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        System.out.println(path1);;
        String path2 = f2.getPath();
        System.out.println(path2);

        System.out.println(f1);
        System.out.println(f1.toString());
    }

    /*public String getAbsolutePath() :返回此File的绝对路径名字符串。
    获取的是构造方法中传递的路径
    不论路径是绝对的还是相对的，getAbsolutePath方法返回的都是绝对路径*/
    private static void show01() {
        File f1 = new File("/home/jeffrey/IdeaProjects/a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1); // /home/jeffrey/IdeaProjects/a.txt

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);


    }
}
