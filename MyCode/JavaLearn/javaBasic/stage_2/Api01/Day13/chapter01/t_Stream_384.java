package Api01.Day13.chapter01;

/*
    使用Stream流的方式，遍历集合，对集合中的数据进行过滤
    Stream流是JDK1.8之后出现的
    关注的是做什么，而不是怎么做
 */

import java.util.ArrayList;
import java.util.List;

public class t_Stream_384 {
    public static void main(String[] args) {
        // 创建一个list集合用于存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        // 对List集合中的元素进行过滤，只要以张开头的元素存储到新的集合中
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length() == 3)
                .forEach(name-> System.out.println(name));
        // 对ListA集合中的代码进行遍历，筛选三个字的姓名并添加到新集合中

        // 遍历集合得到结果
    }
}
