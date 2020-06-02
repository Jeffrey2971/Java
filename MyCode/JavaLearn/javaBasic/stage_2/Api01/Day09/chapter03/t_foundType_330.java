package Api01.Day09.chapter03;

/*
    要求：使用过滤器实现指定目录的文件筛选，使用匿名内部类
 */


import java.io.File;


public class t_foundType_330 {
    public static void main(String[] args) {
        File file = new File("/home/jeffrey/JavaLearn");
        getAllFile(file);
    }

    /*
        定义一个方法,参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFile(File dir) {
        //传递过滤器对象，使用匿名内部类
        /*File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                // 过滤规则，pathname是文件夹或者是.pdf结尾的文件返回true
                return pathname.isDirectory() || pathname.toString().toLowerCase().endsWith(".pdf");

            }
        });*/

        // 使用lambda表达式优化匿名内部类（接口中只有一个抽象方法）
        File[] files = dir.listFiles(pathname->pathname.isDirectory() || pathname.toString().toLowerCase().endsWith(".pdf"));


        /*File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".pdf");
            }
        });*/

        // 使用lambda表达式优化匿名内部类（接口中只有一个抽象方法）
        /*File[] files = dir.listFiles((File d, String name)-> {
            return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".pdf");
        });*/

        // lambda再次优化
        /*File[] files = dir.listFiles((d, name)->
            new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".pdf")
        );*/


        for (File f : files) {
            //对遍历得到的File对象f进行判断,判断是否是文件夹
            if (f.isDirectory()) {
                //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹,遍历文件夹的方法
                //所以直接调用getAllFile方法即可:递归(自己调用自己)
                getAllFile(f);
            } else {
                //f是一个文件,直接打印即可
                System.out.println(f);
            }
        }
    }
}