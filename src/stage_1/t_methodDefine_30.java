package stage_1;

/*
定义格式：
public static void 方法名称() {
    方法体
}
调用格式();
注意事项：
1、方法定义的先后顺序无所谓
2、方法定义必须是挨着的，不能再一个方法的内部定义另外一个方法
3、方法定义之后需要调用才能执行

方法其实就是诺干语句的功能集合

参数：就是进入方法的数据
返回值：从方法中出来的数据

定义方法的完整格式：
修饰符 返回值类型 方法名称（参数类型 参数名称, ...） {
    方法体
    return 返回值;
}

修饰符：现阶段固定写法：public static
返回值类型：也就是方法最终产生的数据结果是什么类型
方法名称：方法的名字，规则和变量一样，小驼峰
参数类型：
    参数类型：进入方法的数据是什么类型
    参数名称：进入方法的数据对应的变量名称
    PS：参数如果有多个，使用逗号进行分割
    方法体：方法需要做的事情，若干行代码
    return：两个作用，第一停止当前方法，第二将后面的结果数据返回值还给调用处
    返回值：也就是方法执行后产生的数据结果
    注意：return后面的返回值必须和方法名称前面的返回值类型保持对应

定义一个两个int数字相加的方法。三要素：
返回值类型：int
方法名称：sum
参数列表：int a, int b

方法的三种调用格式：
    1、单独调用：方法名称（参数）;
    2、打印调用：System.out.println(方法名称(参数);)
    3、赋值调用：数据类型 变量名称= 方法名称（参数）;

注意：返回值类型固定写法为void,这种方法只能够单独调用，不能进行打印调用或者赋值调用

 */

public class t_methodDefine_30 {
    public static void main(String[] args) {
//        method_t1();
        method_t2(10,20);
    }

    public static void method_t1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int method_t2(int a, int b) {
        System.out.println("方法执行了");
        int result = a + b;
        return result;


    }

}

