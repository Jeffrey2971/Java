package stage_2.Api01.Day04.chapter01;

/*
throw关键字：
    作用：
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式：
        throw new xxxException("异常产生的原因");
    注意事项：
        1、throw关键字必须写在方法的内部
        2、throw关键字后面必须new的对象必须是Exception或者Exception的子类对象
        3、throw关键字抛出指定的异常对象，就必须处理掉这个异常对象，处理方式：
            1、throw关键字后面创建的时候RuntimeException或者是RuntimeException的子类对象，可不处理，默认交给JVM处理这个异常对象（打印异常对象，中断程序）
            2、throw关键字后面创建的是编译异常（敲代码时出错），就必须处理这个异常，要么throw要么try-catch
 */

public class t_Throw_269 {
    public static void main(String[] args) {
//        int[] array = null;
        int[] array = new int[5];
        int e = getElement(array, 6);
        System.out.println(e);
    }


    /*
        定义一个方法，获取数组指定索引处的元素
        参数：
            int[] array
            int index
        以后（工作中）首先必须对方法传递过来的参数进行合法性校验
        如果参数不合法，那么将要使用抛出异常的方式，告知方法的调用者传递的参数有问题

        注意：
            NullPointerException是一个运行期异常，自己不处理，默认交给JVM处理
            ArrayIndexOutOfBoundsException是一个运行期异常，自己不处理，默认交给JVM处理
     */
    public static int getElement(int[] array, int index) {

        /*
            对传递过来的参数数组，进行合法性的校验
            如果数组Array的值是null，那么就要抛出空指针异常，告知方法的调用者传递的数组的值为空(null)
         */
        if (array == null){
            throw new NullPointerException("没有值噢");
        }

        /*
            对传递过来的参数（index）进行合法性校验
            如果index的范围超出数组的索引范围内
            那么将抛出数组索引越界异常，告知方法的调用者传递的索引超出了数组的索引范围
         */
        if(index <0 || index > array.length - 1){
            throw new ArrayIndexOutOfBoundsException("数组索引越界了噢");
        }
        int ele = array[index];
        return ele;
    }
}
