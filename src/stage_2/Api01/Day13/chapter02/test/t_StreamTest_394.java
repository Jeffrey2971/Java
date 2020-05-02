package Api01.Day13.chapter02.test;

/*
1. 第一个队伍只要名字为3个字的成员姓名;存储到一个新集合中。
2. 第一个队伍筛选之后只要前3个人;存储到一个新集合中。
3. 第二个队伍只要姓张的成员姓名;存储到一个新集合中。
4. 第二个队伍筛选之后不要前2个人;存储到一个新集合中。
5. 将两个队伍合并为一个队伍;存储到一个新集合中。
6. 根据姓名创建 Person 对象;存储到一个新集合中。
7. 打印整个队伍的Person对象信息。
 */


import java.util.ArrayList;


public class t_StreamTest_394 {
    public static void main(String[] args) {
//第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        // 1. 第一个队伍只要名字为3个字的成员姓名;存储到一个新集合中。
        ArrayList<String> name1 = new ArrayList<String>();
        for (String s : one) {
            if (s.length() == 3) {
                name1.add(s);
            }
        }

        // 2. 第一个队伍筛选之后只要前3个人;存储到一个新集合中。
        ArrayList<String> name2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            name2.add(name1.get(i));
        }


//第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        // 3. 第二个队伍只要姓张的成员姓名;存储到一个新集合中。
        ArrayList<String> name3 = new ArrayList<>();
        for (String s : two) {
            if (s.startsWith("张")) {
                name3.add(s);
            }
        }

        // 4. 第二个队伍筛选之后不要前2个人;存储到一个新集合中。
        ArrayList<String> name4 = new ArrayList<>();
        for (int i = 2; i < name3.size(); i++) {
            name4.add(name3.get(i));
        }

        // 5. 将两个队伍合并为一个队伍;存储到一个新集合中。
        ArrayList<String> all = new ArrayList<>();
        all.addAll(name2);
        all.addAll(name4);

        // 6. 根据姓名创建 Person 对象;存储到一个新集合中。
        ArrayList<t_Person_395> list = new ArrayList<>();
        for (String name : all) {
            list.add(new t_Person_395(name));
        }

        // 7. 打印整个队伍的Person对象信息。
        for (t_Person_395 person : list) {
            System.out.println(person);
        }
    }

}

