package stage_1;
/*
switch语句使用注意事项：
    1、多个case后面的数值不能重复
    2、switch小括号当中只能是以下数据类型：byte/short/char/int
    引用数据类型：String字符串、enum枚举
    3、switch语句格式可以很灵活，前后顺序可以颠倒，而且break语句可以省略
    ”匹配哪一个case就从那一个位置向下执行，直到遇到了break或者整体执行结束为止“

 */
public class t_switch_23 {
    public static void main(String[] args) {
        int num = 6;
        switch (num) {
            default:
                System.out.println("数据错误");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;

        }
    }
}
