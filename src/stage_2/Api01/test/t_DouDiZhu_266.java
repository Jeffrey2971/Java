package stage_2.Api01.test;

/*
    斗地主综合案例，有序版本
        1、准备牌
        2、洗牌
        3、发牌
        4、排序
        5、看牌

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class t_DouDiZhu_266 {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = List.of("♥", "♠", "♦", "梅花");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;

        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }

        /*System.out.println(numbers);
        System.out.println(pokerIndex);*/


        ArrayList<Integer> play1 = new ArrayList<>();
        ArrayList<Integer> play2 = new ArrayList<>();
        ArrayList<Integer> play3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();


        Collections.shuffle(pokerIndex);

        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);

            if (i <= 51) {
                diPai.add(in);
            } else if (i % 3 == 0) {
                play1.add(in);
            } else if (i % 3 == 1) {
                play2.add(in);
            } else {
                play3.add(in);
            }
        }
        Collections.sort(play1);
        Collections.sort(play2);
        Collections.sort(play3);
        Collections.sort(diPai);

        lookPoker("玮海琼", poker, play1);
        lookPoker("陈禧", poker, play2);
        lookPoker("洪泽飞", poker, play3);


    }

    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        // 输出玩家的名称，并且不换行
        System.out.print(name + " ");
        // 遍历玩家或者底牌集合，获取牌的索引
        for (Integer key : list) {
            // 使用牌的索引，去Map集合中，找到对应的牌
            String value = poker.get(key);
            System.out.print(value + " ");

        }
        System.out.println(); // 打印完每一个玩家的牌，换行
    }
}
