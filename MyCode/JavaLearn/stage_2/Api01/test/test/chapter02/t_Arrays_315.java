package Api01.test.test.chapter02;

/*
要求：
    使用数组存储多个Person对象
    对数组中的Person对象使用ArrayList的sort方法通过年龄进行生序排序

 */

import java.util.Arrays;

public class t_Arrays_315 {
    public static void main(String[] args) {
        // 创建数组，使用数组存储多个Person对象
        t_Person_314[] array = {
                new t_Person_314("玮海琼", 25),
                new t_Person_314("张雯蔚", 21),
                new t_Person_314("陈禧", 26),
        };

        // 对数组中的Person对象使用ArrayList的sort方法通过年龄进行升序（前-后）排序
        /*Arrays.sort(array, new Comparator<t_Person_314>() {
            @Override
            public int compare(t_Person_314 o1, t_Person_314 o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        // 使用lambda表达式，简化匿名内部类
        Arrays.sort(array, (t_Person_314 o1, t_Person_314 o2) -> {
            return o1.getAge() - o2.getAge();
        });

        // 优化Lambda
        Arrays.sort(array, (o1, o2) -> o1.getAge() - o2.getAge());

        // 遍历数组
        for (t_Person_314 p : array) {
            System.out.println(p);
        }

    }
}
