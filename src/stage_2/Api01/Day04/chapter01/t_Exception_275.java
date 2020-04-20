package stage_2.Api01.Day04.chapter01;

/*
多个异常使用捕获：
    1、多个异常分别处理
    2、多个异常一次捕获，多次处理
    3、多个异常一次捕获一次处理

异常注意事项

 */

import java.util.List;

public class t_Exception_275 {
    public static void main(String[] args) {

        // 1、多个异常分别处理
        /*try {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组" + e);
        }

        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));  // IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
        }catch(IndexOutOfBoundsException e){
            System.out.println("集合" + e);

        }
        System.out.println("后续代码");*/

        System.out.println("--------------------------------");
        // 2、多个异常一次捕获，多次处理
        /*
        一个try多个catch注意事项：
            catch里面定义的异常，如果有字符类关系，
            那么子类的异常变量必须写在上面，否则报错
            ArrayIndexOutOfBoundsException（子）
            extends IndexOutOfBoundsException（父）
         */
        /*try {
            int[] array = {1, 2, 3};
            // System.out.println(array[3]);

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("集合" + e);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("列表" + e);
        }*/

        System.out.println("--------------------------------");
        // 3、多个异常一次捕获一次处理
        /*try {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));

        // } catch (IndexOutOfBoundsException e) {
        } catch (Exception e) {
            System.out.println("集合" + e);
        }
        System.out.println("后续代码");*/

        System.out.println("--------------------------------");
        // 运行时异常抛出可以不处理，既不捕获也不处理
        //

        int[] array = {1, 2, 3};
        System.out.println(array[3]);

        List<Integer> list = List.of(1, 2, 3);
        System.out.println(list.get(3));

        System.out.println("后续代码");
    }

}
