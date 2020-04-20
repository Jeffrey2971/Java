package stage_1.Lproject.RedPackeg;

import java.util.ArrayList;

public class t_MainRedPackeg_158 {
    public static void main(String[] args) {
        // 群主
        t_Manager_156 manager = new t_Manager_156("群主", 10000);

        // 成员
        t_Member_157 one = new t_Member_157("成员A", 0);
        t_Member_157 two = new t_Member_157("成员B", 0);
        t_Member_157 three = new t_Member_157("成员C", 0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("====================");

        //
        ArrayList<Integer> redList = manager.send(2350,3);
        // 三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        System.out.println("====================");

        manager.show();
        one.show();
        two.show();
        three.show();

    }
}
