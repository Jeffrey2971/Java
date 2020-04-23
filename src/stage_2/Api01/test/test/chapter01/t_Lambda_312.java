package Api01.test.test.chapter01;

/*
要求：
    给定一个厨子 Cook 接口,内含唯一的抽象方法 makeFood ,且无参数、无返回值。
    请使用Lambda的标准格式调用 invokeCook 方法,打印输出“吃饭啦!”字样
 */

public class t_Lambda_312 {
    public static void main(String[] args) {
        // 调用invokeCook方法，参数是cook接口，传递Cook接口的匿名内部类
        invokeCook(new t_CookImpl_313() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦1");
            }
        });

        // 使用lambda表达式，简化匿名内部类代码
        invokeCook(()->{
            System.out.println("吃饭了2");
        });
    }

    // 定义一个方法，参数传递Cook接口，方法内部调用Cook接口中的方法叫makeFood
    public static void invokeCook(t_CookImpl_313 cook){
        cook.makeFood();
    }
}
