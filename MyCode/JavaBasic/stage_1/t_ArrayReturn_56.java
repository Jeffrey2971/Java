/*
一个方法可以有0,1,2等回个参数，但是只能有0或1个返回值，不能有多个返回值
如果希望一个方法当中产生多个数据并进行返回可使用一个数组进行返回即可

任何数据类型都能作为方法的参数类型，或者返回值类型

数组作为方法的参数，传递进去的其实是数组的地址值
数组作为方法的返回值，返回的其实也是数组的地址值

 */
public class t_ArrayReturn_56 {
    public static void main(String[] args) {
//        System.out.println(calculate(3,4,5)[0]);
        int[] result = calculate(3,5,3);
        System.out.println("总和为：" + result[0]);
        System.out.println("平均为：" + result[1]);
    }
    public static int[] calculate(int a, int b, int c){
        int sum = a + b +c; //总和
        int avg = sum /3; // 平均数
//        int [] array = new int[2];
//        array[0] = sum;
//        array[1] = avg;
        int[] array = {sum, avg};
        return array;
    }
}
