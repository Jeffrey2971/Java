package test;

/*
题目：
定义一个方法，把数组{1, 2, 3}按照指定格式拼接成为一个字符串，参照格式如下：
[word1#word2#word3]


 */

public class t_StringPractise_101 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(fromArrayToString(array));

    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "world" + array[i] + "]";
            } else {
                str += "world" + array[i] + "#";
            }

        }
        return str;
    }

}



