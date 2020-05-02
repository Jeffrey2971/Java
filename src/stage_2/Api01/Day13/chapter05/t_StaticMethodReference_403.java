package Api01.Day13.chapter05;

/*
    通过类名引用静态的成员方法
    类已经存在，静态成员方法已经存在
    就可以通过类名称直接引用静态成员方法
 */

public class t_StaticMethodReference_403 {
    // 定义一个方法，方法的参数传递要计算的绝对值的整数和函数式接口callable
    public static int method(int number, t_callable_404 calc){
        return calc.calAbs(number);

    }

    public static void main(String[] args) {
        // 调用method方法，传递计算绝对值的整数，和lambda表达式
        int num = method(-20, (n) -> {
            // 对参数进行绝对值的计算并返回结果
            return Math.abs(n);
        });

        System.out.println(num);

        /*
            使用方法引用优化lambda表达式
            Math类是存在的
            abs计算绝对值的静态方法也是存在的
            所以可以直接通过类名引用静态方法
         */
        int num2 = method(-10, Math::abs);
        System.out.println(num2);
    }
}
