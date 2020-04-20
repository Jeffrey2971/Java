package stage_1.Day.Day13.chapter_02;

import java.util.ArrayList;
import java.util.List;

/*
java.util.List正是ArrayList所实现的接口
 */

public class t_Interface_231 {
    public static void main(String[] args) {

        // 左边是接口，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));

        }

    }
    public static List<String> addNames(List<String> list){
        list.add("陈喜");
        list.add("玮海琼");
        list.add("张雯蔚");
        return list;
    }
}
