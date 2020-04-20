package stage_1;

import java.util.Random;

public class t_Random_84 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10); // 实际范围是：1~9
            System.out.println(num);

        }
    }
}
