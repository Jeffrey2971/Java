package stage_2.Api01.Day03.chapter02;

/*
java.util.Hashtable<K, V>集合 implements Map<K, V>接口

HashTable的特点：底层是一个哈希表，是一个线程安全的集合，也是单线程集合，速度慢
HashMap特点：底层是一个哈希表，是一个线程不安全的集合，多线程的集合，速度快

HashMap集合（及之前所有的集合）：可以存储null值，null键
HashTable集合，不允许存储null值，null键

HashTable和Vector集合一样，在JDK1.2版本之后被淘汰，被更先进的集合所取代（HashMap， ArrayList）
HashTable的子类Properties依然活跃在历史的舞台
Properties集合是唯一一个和IO流相结合的集合

 */

import java.util.HashMap;
import java.util.Hashtable;

public class t_HashTable_260 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);

        System.out.println("------------------");

        Hashtable<String, String> table = new Hashtable<>();
//        table.put(null, "a"); 错误写法，空指针异常NullPointerException
//        table.put("b", null); 错误写法，空指针异常NullPointerException
//        table.put(null, null); 错误写法，空指针异常NullPointerException
        System.out.println(table);
    }
}
