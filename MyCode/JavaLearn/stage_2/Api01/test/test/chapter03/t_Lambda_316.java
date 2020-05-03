package Api01.test.test.chapter03;

/*
Lambda表达式有参数的返回值联系
要求：
    给一个计算器Calculator接口，内涵抽象方法calc可以讲两个int数字相加得到值
    使用Lambda的标准格式调用invokeCalc，完成120和130的相加计算

 */

public class t_Lambda_316 {
    public static void main(String[] args) {
        // 调用invokeCalc方法，方法的参数是一个接口，可以使用匿名内部类
        invokeCalc(10, 20, new t_Calculator_317() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        // 使用Lambda表达式简化匿名内部类的代码
        invokeCalc(120, 130, (int a, int b) -> {
            return a + b;
        });

        // 优化Lambda
        invokeCalc(120, 130, (a, b) -> a + b);
    }

    /*
     * 定义一个方法
     * 参数传递两个int类型的整数
     * 参数传递Calculator接口
     * 方法内部调用Calculator中的方法calc计算两个整数的和
     * */
    public static void invokeCalc(int a, int b, t_Calculator_317 c) {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }

}
