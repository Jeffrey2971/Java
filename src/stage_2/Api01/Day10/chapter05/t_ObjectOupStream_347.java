package Api01.Day10.chapter05;


/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream：对象的序列化流
    作用：把对象以流的方式写入到文件中保存

    构造方法：
        ObjectOutputStream(OutputStream out)创建写入OutputStream的ObjectOutputStream
        参数：
            OutputStream out：字节输出流
        特有的成员方法：
            void writerObject(Object obj)将指定的对象写入ObjectOutputStream
        使用步骤：
            1、创建一个ObjectOutputStream对象，构造方法中传递字节输出流
            2、使用ObjectOutputStream对象中的方法writeObject把对象写入到文件中
            3、资源释放

 */
public class t_ObjectOupStream_347 {

}
