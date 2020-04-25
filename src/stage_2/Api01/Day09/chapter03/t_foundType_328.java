package Api01.Day09.chapter03;

/*
    要求：使用过滤器实现指定目录的文件筛选
 */


import java.io.File;

/*
    在File类中，有两个ListFiles重载的方法，方法的参数传递的就是过滤器
    File[] listFiles(FileFilter filter)
        java.oio.FileFilter接口：用于抽象路径名（File对象）的过滤器
        作用：用来过滤文件（File对象）
        抽象方法：用于过滤文件的方法
            boolean accept(File pathname)测试指定抽象路径名是否应该包含在某个路径列表中
            参数：
                File pathname：使用ListFiles方法遍历目录得到的每一个文件对象
    File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter接口：实现此接口的类实例可用于过滤文件名
        作用：用于过滤文件名称
        抽象方法：用于过滤文件的方法
            boolean accept(File dir, String name)测试指定文件是否应该包含在某一文件列表中
            参数：
                File dir：构造方法中传递的被遍历的目录
                String name：使用ListFiles方法遍历目录获取的每一个文件/文件夹的名称
    注意事项：
        两个过滤器接口是没有实现类的，需要自己写实现类，重写过滤方法accept，在方法中自己定义过滤的规则
 */
public class t_foundType_328 {
    public static void main(String[] args) {
        File file = new File("/home/jeffrey/JavaLearn");
        getAllFile(file);
    }

    /*
        定义一个方法,参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
        File[] files = dir.listFiles(new t_FileFilterImpl_329());//传递过滤器对象
        for (File f : files) {
            //对遍历得到的File对象f进行判断,判断是否是文件夹
            if(f.isDirectory()){
                //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹,遍历文件夹的方法
                //所以直接调用getAllFile方法即可:递归(自己调用自己)
                getAllFile(f);
            }else{
                //f是一个文件,直接打印即可
                System.out.println(f);
            }
        }
    }
}