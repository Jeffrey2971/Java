package Api01.Day03.chapter02;

import java.util.LinkedHashMap;
import java.util.Map;

public class t_test_261 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();

        map.put(1, "星期一");

        map.put(2, "星期二");

        map.put(3, "星期三");

        map.put(4, "星期四");

        map.put(5, "星期五");

        map.put(6, "星期六");

        map.put(7, "星期日");
        System.out.println(map.keySet());

        for (Integer key : map.keySet()) {
            System.out.println(key); // 键
            String value = map.get(key); // 根据键取出值
            System.out.println(key + "=" + value);
        }

    }
}
