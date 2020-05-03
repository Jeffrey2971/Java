package Api01.Day12.chapter03.test;

/*
    练习：
    下面的字符串数组当中存有多条信息,请按照格式“ 姓名:XX。性别:XX。 ”的格式将信息打印出来。要求将打印姓
    名的动作作为第一个 Consumer 接口的Lambda实例,将打印性别的动作作为第二个 Consumer 接口的Lambda实
    例,将两个 Consumer 接口按照顺序“拼接”到一起。
 */

import java.util.function.Consumer;

public class t_Consumer_373 {
    // 定义一个方法，参数传递String类型的数组和两个Consumer接口，泛型使用String
    public static void PrintInfo(String[] array, Consumer<String> con1, Consumer<String> con2){
        // 遍历字符串数组
        for (String msg : array) {
            // 使用AndThen连接两个Consumer接口消费字符串
            con1.andThen(con2).accept(msg);


        }
    }

    public static void main(String[] args) {
        // 定义一个字符串类型数组
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
        // 调用PrintInfo方法，传递一个字符串数组和两个lambda表达式
        PrintInfo(array,
                (msg)->{
                    // 消费方式：对msg进行切割，获取姓名，按照指定的格式输出
                    String name = msg.split(",")[0];
                    System.out.print("姓名：" + name + "，");
                },
                (msg)->{
                    // 消费方式：对msg进行切割，获取年龄，按照指定的格式输出
                    String age = msg.split(",")[1];
                    System.out.print("性别：" + age);
                    System.out.println();
                });
    }
}
