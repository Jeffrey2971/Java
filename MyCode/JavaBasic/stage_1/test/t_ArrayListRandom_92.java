package test;

/*
题目：
1、定义一个方法，生成6个1~33之间的随机整数，添加到集合，并遍历集合
2、定义一个方法，定义4个学生对象，添加到集合，并遍历
3、定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@分割每个元素
    参照格式{元素@元素@元素}

    System.out.println(list);   [10, 20, 30]
    printArrayList(list);       {10@20@30}
4、用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
要求使用自定义方法来实现筛选
 */


import java.util.ArrayList;
import java.util.Random;

public class t_ArrayListRandom_92 {
    public static void main(String[] args) {
//        idea_one();
//        System.out.println("========================");
//        idea_two();
//        System.out.println("========================");
//        ArrayList<String> list = new ArrayList<>();
//        list.add("张雯蔚");
//        list.add("洪泽飞");
//        list.add("韦海琼");
//        idea_three(list);
//        System.out.println("========================");
        idea_four();


    }

    public static void idea_one() {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33) + 1);

        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));

        }
    }

    public static void idea_two() {
        ArrayList<stage_1.test.Practice_Class.t_Student_93> list = new ArrayList<>();

        stage_1.test.Practice_Class.t_Student_93 one = new stage_1.test.Practice_Class.t_Student_93("张雯蔚", 19);
        stage_1.test.Practice_Class.t_Student_93 two = new stage_1.test.Practice_Class.t_Student_93("文蔚张", 20);
        stage_1.test.Practice_Class.t_Student_93 three = new stage_1.test.Practice_Class.t_Student_93("蔚张雯", 21);
        stage_1.test.Practice_Class.t_Student_93 four = new stage_1.test.Practice_Class.t_Student_93("雯蔚张", 22);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            stage_1.test.Practice_Class.t_Student_93 stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + ",年龄：" + stu.getAge());


        }

    }

    public static void idea_three(ArrayList<String> list) {
        list.add("张雯蔚");
        list.add("洪泽飞");
        list.add("韦海琼");
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(name + "}");
            } else {
                System.out.print(name + "@");

            }
        }

    }

    public static void idea_four() {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100) + 1);
        }
        ArrayList<Integer> even = new ArrayList();
        for (int j = 0; j < list.size(); j++) {
            int num = list.get(j);
            if (num % 2 == 0) {
                even.add(num);
            }

        }
        System.out.println(even);
    }

}




