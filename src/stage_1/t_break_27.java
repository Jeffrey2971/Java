package stage_1;

/*
break关键字的用法常见有两种：
1、可以用在switch语句中，一旦执行（break），整个switch语句将会立即终止
2、还可以用在循环语句中（for while do-while），一旦执行（break），整个循环语句将会直接终止（打断循环）

关于选择循环的建议：
凡是次数确定的场景多数使用for循环，否则多用while循环
 */
public class t_break_27 {
    public static void main(String[] args) {
        t1();
        t2();
        t3();


    }


    public static void t1() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("到80我就会终止循环" + i);
            if (i == 80) {
                System.out.println("循环结束");
                break;
            }
        }
    }

    public static void t2() {
        int i = 1;
        while (i <= 100) {
            System.out.println("到70我就会终止循环");
            i++;
            if (i == 70) {
                System.out.println("循环结束");
                break;
            }

        }

    }

    public static void t3() {
        int i = 1;
        do {
            i++;
            System.out.println("到56我就会终止循环");
            if (i == 56) {
                System.out.println("循环结束");
                break;
            }
        } while (i <= 100);

    }
}
