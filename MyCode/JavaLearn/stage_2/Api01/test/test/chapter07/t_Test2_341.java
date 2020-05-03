package Api01.test.test.chapter07;

/*
    练习：
        对文本的内容进行排序
        对照（1,2,3,4... ...）顺序排序
    分析：
        1、创建一个HashMap集合对象，可以存在每行的序号（1,2,3,4）;value存储每行的文本
        2、创建字符缓冲输入流对象，构造方法中绑定字符输入流
        3、创建字符缓冲输出流对象，构造方法中绑定字符输出流
        4、使用字符缓冲输入流中的方法readLine，逐行读取文本
        5、对读取到的文本内进行切割，获取行中的序号和文本的内容
        6、把切割好的序号和文本的内容存储到HashMap集合中（key序号是有序的，会自动排序，1,2,3,4...）
        7、遍历HashMap集合获取每一个键值对
        8、把每一个键值对拼接为一个文本行
        9、把拼接好的文本行使用字符缓冲输出流中的方法write写入到文件中
        10、释放资源
 */

import java.util.HashMap;

public class t_Test2_341 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/test/test/chapter07/in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/test/test/chapter07/out.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] array = line.split("\\.");
            map.put(array[0], array[1]);
        }
        for (String key : map.keySet()) {
            String value = map.get(key);
            line = key + "." + value;
            bw.flush();
            bw.write(line + "\n");
        }
        bw.close();
        br.close();

    }
}
