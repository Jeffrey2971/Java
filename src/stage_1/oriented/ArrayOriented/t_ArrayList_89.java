package stage_1.oriented.ArrayOriented;

/*
数组的长度不可以改变。
但是ArrayList集合的长度是可以随意变化的

对于ArrayList 来说，有一个尖括号<E>代表泛型
泛型：也就是装在集合当中的所有元素，全都是统一的类型
注意：泛型只能是引用类型，不能是基本类型

注意事项：
对于arrayList集合来说，直接打印得到的不是地址值，而是内容
如果内容是空，得到的是空格中括号：[]
 */

import java.util.ArrayList;

public class t_ArrayList_89 {
    public static void main(String[] args) {
        // 创建了一个ArrayList集合，集合的名称是List，；里面装的全部都是String字符串
        // 备注：从JDK1.7开始，右侧的尖括号内部可以不写内容，但是<>本身还需要写。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // 像集合中添加数据，需要用到add方法。
        list.add("张雯雯");
        System.out.println(list); // []
        list.add("张文文");
        list.add("张张张");
        System.out.println(list); // []
//        list.add(123); 错误写法！因为创建的时候尖括号泛型已经说了是字符串，添加进去的元素就必须是字符串才行

    }

}
