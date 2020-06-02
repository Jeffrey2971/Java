package Api01.Day04.chapter01;

/*
java.lang.Throwable类：是一个Java语言中所有错误或异常的超类。
    Exception：编译器异常，进行编译（敲代码）Java程序时出现的问题
        RuntimeException：运行期异常，Java程序运行过程中出现的问题，相当于程序得了一个小毛病（感冒发烧得痔疮），把异常处理掉即可继续执行（嗑药）。
    Error：错误，相当于程序得了一个无法解决的问题（癌症），必须修改源代码，程序才能继续运行

 */

public class t_Exception_267 {
    public static void main(String[] args) /*throws ParseException*/ {
        // Exception：编译器异常，进行编译（敲代码）Java程序时出现的问题
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 用于格式化日期
        Date date  = null;
        try {
            date = sdf.parse("199909-10"); // 把字符串格式的日期，解析为Date格式的日期
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/

        // RuntimeException：运行期异常，Java程序运行过程中出现的问题，相当于程序得了一个小毛病（感冒发烧得痔疮），把异常处理掉即可继续执行（嗑药）。
        /*int[] array = {1, 2, 3, 4}; // ArrayIndexOutOfBoundsException
        // System.out.println(array[0]);
        try{
            // 可能会出异常的代码
            System.out.println(array[4]); // ArrayIndexOutOfBoundsException
        }catch(Exception e){
            // 异常的处理逻辑
            System.out.println(e);
        }*/

        // Error：错误
        /*int[] array = new int[1024*1024*1024];*/ // OutOfMemoryError: Java heap space，内存溢出，创建的数组太大，超出了给JVM分配的内存
        // 必须修改代码使创建的数组少一点
        int[] array = new int[1024*1024];
        System.out.println("后续代码");




    }
}
