package Api01.Day09.chapter02;

/*
java.io.File类
文件和目录路径名的抽象表示形式
java把电脑中的文件和文件夹（目录）封装为了一个File类，可以使用File类对文件和文件夹进行操作
使用File类的方法：
    创建文件/文件夹
    删除文件/文件夹
    获取文件/文件夹
    判断文件/文件夹是否存在
    对文件夹进行遍历
    获取文件的大小
File类是一个与系统无关的类，任何的系统都可以使用这个类中的方法

File类中有四个静态成员变量：
    1、static StringBuilder pathSeparator 与系统有关的路径分隔符，为了方便，他被表示为一个字符串
    2、static char pathSeparatorChar 与系统有关的路径分隔符
    3、static String separator与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串
    4、static char separatorChar 以系统有关的默认名称分隔符

注意事项：
    1、操作路径，路径不能写死
        Windows：c:\windows\Jeffrey
        Linux：/home/Jeffrey
        "+File.separator+"home"+File.separator+"Jeffrey
 */

import java.io.File;

public class t_File_318 {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); // 路径分隔符 Windows：分号; Linux系统：冒号:
        System.out.println("----------------");
        String separator = File.separator;
        System.out.println(separator); // 文件名称分隔符 Windows：反斜杠\ Linux系统：正斜杠/
    }
}
