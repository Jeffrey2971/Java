package Api01.Day12.chapter01;

/*
    函数式接口的使用：一般可以作为方法的参数和返回值类型
 */

public class t_Main_363 {
    // 定义一个方法，参数使用函数式接口FunctionalInterface
    public static void show(t_MyFunctionalInterface_361 myInter){
        myInter.method();

    }

    public static void main(String[] args) {
        // 调用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new t_FunctionalInterfaceImpl_362());

        // 调用show方法，方法的参数是一个接口，所以可以传递接口的匿名内部类
        show(new t_MyFunctionalInterface_361() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        // 调用show方法，方法的参数是一个函数式接口，所以可以使用lambda表达式
        show(()->{
            System.out.println("使用lambda表达式重写接口的愁绪爱你方法");
        });

        // 简化lambda表达式
        show(()->System.out.println("使用lambda表达式重写接口的愁绪爱你方法"));
    }
}
