package Api01.Day12.chapter03.test;

/*
下面的字符串数组当中存有多条信息,请按照格式“ 姓名:XX。性别:XX。 ”的格式将信息打印出来。要求将打印姓
名的动作作为第一个 Consumer 接口的Lambda实例,将打印性别的动作作为第二个 Consumer 接口的Lambda实
例,将两个 Consumer 接口按照顺序“拼接”到一起。


 */

import java.util.function.Consumer;

public class t_Consumer_374 {
    public static void PrintInfo(String[] array, Consumer<String> con1, Consumer<String> con2) {
        for (String s : array) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};

        PrintInfo(array,
                (msg) -> {
                    String name = msg.split(",")[0]; // 姓名
                    System.out.print("姓名：" + name + "，");
                },
                (msg) -> {
                    String age = msg.split(",")[1]; // 年龄
                    System.out.print("性别：" + age);
                    System.out.println();
                });
    }
}
