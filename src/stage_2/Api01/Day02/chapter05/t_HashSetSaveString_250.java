package stage_2.Api01.Day02.chapter05;

/*
    Set集合不允许存储重复元素的原理
 */

import java.util.HashSet;

public class t_HashSetSaveString_250 {
    public static void main(String[] args) {
        // 创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
    }
}
