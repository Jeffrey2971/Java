package Api01.Day09.chapter02;

/*
File类创建删除功能方法
    public boolean createNewFile() :当且仅当具有该名称的文件尚不存在时,创建一个新的空文件。
    public boolean delete() :删除由此File表示的文件或目录。
    public boolean mkdir() :创建由此File表示的目录。
    public boolean mkdirs() :创建由此File表示的目录,包括任何必需但不存在的父目录。
 */

import java.io.File;
import java.io.IOException;

public class t_File_322 {
    public static void main(String[] args) throws IOException {
        // show01();
        // show02();
        show03();
    }


    /*
        public boolean delete() :删除由此File表示的文件或目录。
        此方法，可以删除构造方法路径中给出的文件/文件夹
        返回值：布尔值（true/false）
            true：文件/文件夹删除成功
            false：文件夹中有内容，不会删除返回false，构造方法中的路径不存在也返回false

        注意事项：
            delete方法是直接在硬盘删除文件/文件夹，不会进入回收站，删除需谨慎
     */
    private static void show03() {
        File f1 = new File("/home/jeffrey/IdeaProjects/JavaLearn/新建文件夹");
        boolean b1 = f1.delete();
        System.out.println("b1" + b1);

        File f2 = new File("test.txt");
        boolean b2 = f2.delete();
        System.out.println("b2" + b2);
    }



    /*
        public boolean mkdir() :创建单级的空文件夹
        public boolean mkdirs() :既可以创建单级的空文件夹，也可以创建多级的空文件夹

        创建文件夹的路径和名称在构造方法中给出（构造方法的参数）
        返回值：布尔值（true、false）
            true：文件夹不存在，创建文件夹并返回true
            false：文件夹存在，不会创建并返回false，构造方法中给出的路径不存在也返回false

        注意事项：
            1、此方法只能创建文件夹，不能创建文件
     */
    private static void show02() {
        File f1 = new File("新建文件夹");
        boolean b1 = f1.mkdir();
        System.out.println("b1" + b1);

        File f2 = new File("新建文件夹/aaa/bbb/ccc/ddd");
        boolean b2 = f2.mkdir();
        System.out.println("b2" + b2); // false：mkdir方法不能创建多级文件夹

        File f3 = new File("新建文件夹/aaa/bbb/ccc/ddd");
        boolean b3 = f3.mkdirs();
        System.out.println("b3" + b3);

        File f4 = new File("abc.txt");
        boolean b4 = f4.mkdir();
        System.out.println("b4" + b4);

        File f5 = new File("/home/home/test");
        boolean b5 = f5.mkdir();
        System.out.println("b5" + b5); // 不会抛出异常，路径不存在则不会创建
    }


    /*
        public boolean createNewFile() :当且仅当具有该名称的文件尚不存在时,创建一个新的空文件。
        创建文件的路径和名称在构造方法中给出（构造方法的参数）
        返回值：布尔值（true、false）
            true：文件不存在，创建文件并返回true
            false：文件存在，不会创建并返回false

        注意事项：
            1、此方法只能创建文件，不能创建文件夹
            2、创建文件的路径必须存在否则会抛出异常
            3、createNewFile方法声明了抛出IOException，调用这个方法时必须处理这个异常，要么throw要么try-catch
     */
    private static void show01() throws IOException {
        File f1 = new File("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day09/chapter02/test.txt"); // 绝对路径
        boolean b1 = f1.createNewFile();
        System.out.println("b1" + b1);

        File f2 = new File("test2.txt");
        boolean b2 = f2.createNewFile();
        System.out.println("b2" + b2);

        File f3 = new File("新建文件夹");
        boolean b3 = f3.createNewFile();
        System.out.println("b3" + b3); // 还是一个文件

        File f4 = new File("/home/home/新建文件夹");
        boolean b4 = f4.createNewFile();
        System.out.println("b4" + b4);

    }
}
