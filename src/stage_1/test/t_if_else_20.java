package stage_1.test;

/*
x和y的关系满足如下
如果 x >= 3，那么 y = 2x + 1;
如果 -1 < x < 3，那么 y = 2x;
如果 x <= -1, 那么 y = 2x -1 ;
 */

public class t_if_else_20 {
    public static void main(String[] args) {
        int x = 666;
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (-1 < x && x < 3) {
            y = 2 * x;
        } else {
            y = 2 * 3 - 1;
        }
    System.out.println("结果是：" + y);
    }

}
