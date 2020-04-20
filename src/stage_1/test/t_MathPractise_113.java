package stage_1.test;

/*
题目：计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个

分析
1、既然已经确定了范围，次数确定使用for循环
2、起点位置-10.8应该转换为-10，两种办法：
    2.1、可以使用Math,ceil方法，向上取整
    2.2、强制转换为int，自动舍弃所有小数位
3、每一个数字都是整数，所以步进表达式应该是num++
4、如何拿到绝对值：Math.abs方法
5、一旦发现一个数字，需要让计数器++

备注：如果使用Ｍａｔｈ.ceil方法，－１０．８可以变成-10.0，ｄｏｕｂｌｅ值也可进行++
 */

public class t_MathPractise_113 {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        // 这样处理，变量i就是区间之内所有的整数
        int count = 0;
        for (int i = (int) min; i < max; i++) {

            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                count++;
            }

        }
        System.out.println("共有" + count + "符合要求");
    }
}
