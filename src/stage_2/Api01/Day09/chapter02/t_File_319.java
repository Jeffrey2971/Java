package Api01.Day09.chapter02;

/*
路径：
    绝对路径：是一个完整的路径
        以盘符(c,d,e,f等盘符)开始的路径
            c:\\user\\jeffrey\\a\\a.txt
    相对路径：是一个简化的路径
        相对指的是相对于当前项目的根目录
        如果使用当前项目的根目录，路径可以简化书写
        c:\\user\\jeffrey\\a\\a.txt --> 简化为：a.txt（可以省略项目的根目录）

注意事项：
    1、路径是不区分大小写的
    2、路径中的文件名称分隔符Windows系统使用的是反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠，linux系统中则不用

 */

import java.io.File;

public class t_File_319 {
    public static void main(String[] args) {
        /*
            File类的构造方法
         */
        show01();
        //show02("/home", "a.txt");
        show02("/home/jeffrey", "a.txt");
        show03();

    }


    /*
        File(File parent, String child)根据parent抽象路径和child路径名字字符串创建一个新File实例
        参数：把路径分成了两部分
            String parent：父路径
            String child：子路径
        好处：
            1、父路径和子路径，可以单独的书写，使用起来非常的灵活，父路径和子路径都可以变化
            2、父路径是File类型，可以使用File类的方法对路径进行一些操作，再使用路径创建对象
     */
    private static void show03() {
        File parent = new File("/home");
        File file = new File(parent, "hello.java");
        System.out.println(file); // /home/hello.java
    }

    /*
        File(String parent, String child)根据parent路径名字字符串child路径字符串创建一个新的File实例
        参数：把路径分成了两部分
            String parent：父路径
            String child：子路径
        好处：
            父路径和子路径，可以单独的书写，使用起来非常的灵活，父路径和子路径都可以变化
     */
    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file); // /home/a.txt

    }

    /*
        File(String pathname)通过将给定的路径字符串名称转换为抽象路径名来创建一个新的File实例
        参数：
            String pathname：字符串的路径名称
            路径可以是以文件结尾，也可以是以文件夹结尾
            路径可以是相对路径，也可以是绝对路径
            路径可以是存在的，也可以是不存在的
            创建File对象，只是把字符串的路径封装为File对象，不考虑路径的真假情况
     */
    private static void show01() {
        File f1 = new File("/home/jeffrey/IdeaProjects/JavaLearn/a.txt");
        System.out.println(f1); // 重写了Object的toString方法，/home/jeffrey/IdeaProjects/JavaLearn/a.txt
        System.out.println("----------------");

        File f2 = new File("/home/jeffrey/IdeaProjects/JavaLearn");
        System.out.println(f2); // /home/jeffrey/IdeaProjects/JavaLearn
        System.out.println("----------------");

        File f3 = new File("b.txt");
        System.out.println(f3); // b.txt


    }
}
