package stage_2.Api01.Day04.chapter01;

/*
    try...catch：异常处理的第二种方式，自己处理异常
    格式：
        try{
            // 可能产生异常的代码
        }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
            // 异常的处理逻辑，产生异常对象之后，怎么处理异常对象，一般在工作中，会把异常信息记录到日志中
        }
        ...
        catch(异常类名 变量名){
            // ...
        }
    注意事项：
        1、try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
        2、如果try中产生了异常，那么将会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑后，继续执行try...catch之后的代码
            如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，执行完后将继续执行try...catch之后的代码

 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class t_Exception_272 {
    public static void main(String[] args) {
        try{
            readFile("/home/jeffrey/in.txt");
        }catch(IOException e){ // try中抛出什么异常对象，catch就定义什么异常变量，用来接受这个异常对象
            // 常的处理逻辑，产生异常对象之后，怎么处理异常对象
            System.out.println("catch 传递的文件后缀名不是.txt");
        }
        System.out.println("后续代码");
    }
        /*
            如果传递的路径不是.txt结尾，那么将抛出异常IO异常对象，告知方法调用者文件的后缀名错误
         */
    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("后缀名错误");

        }
        System.out.println("Ok");
    }
}
