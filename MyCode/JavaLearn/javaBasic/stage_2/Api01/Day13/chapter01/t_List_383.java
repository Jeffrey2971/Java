package Api01.Day13.chapter01;

/*
    用传统方式遍历集合，对集合中的数据进行过滤
 */


import java.util.ArrayList;
import java.util.List;

public class t_List_383 {
    public static void main(String[] args) {
        // 创建一个list集合用于存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        // 对List集合中的元素进行过滤，只要以张开头的元素存储到新的集合中
        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                listA.add(s);
            }
        }

        // 对ListA集合中的代码进行遍历，筛选三个字的姓名并添加到新集合中
        ArrayList<String> listB = new ArrayList<>();
        for (String s : listA) {
            if (s.length() == 3) {
                listB.add(s);
            }
        }

        // 遍历集合得到结果
        for (String s : listB) {
            System.out.println(s);

        }
    }
}
