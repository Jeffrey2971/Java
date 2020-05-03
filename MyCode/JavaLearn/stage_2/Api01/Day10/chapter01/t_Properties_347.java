package Api01.Day10.chapter01;

/*
    java.util.Properties集合 extends hashtable<k, v> implements Map<k, v>
    Properties 类表示了一个持久的属性集，Properties可以保存在流中或从流中加载
    Properties集合是唯一一个和IO流相结合的集合
        可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用
    属性列表中每个键值对都是一个字符串
        Properties集合是一个双列集合，key和value默认都是字符串
 */

import java.util.Properties;
import java.util.Set;

public class t_Properties_347 {
    public static void main(String[] args) throws IOException {
        // show01();
        // show02();
        show03();
    }

    /*
        可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用
        void load(InputStream inStream)
        void load(Reader reader)
        参数：
            InputStream inStream：字节输入流，不能读取含有中文的键值对
            Reader reader：字符输入流，可以读取含有中文的键值对
        使用步骤：
            1、创建一个Properties集合对象
            2、使用Properties集合对象中的方法load读取保存键值对的文件
            3、遍历Properties集合
        注意事项：
            1、存储键值对的文件中，键与值默认的连接符号可以使用=或空格（其他符号）
            2、存储键值对的文件中，可以使用#进行注释，备注释的键值对不会再被读取
            3、存储键值对的文件中，键与值默认都是字符串，不用再加上引号
     */
    private static void show03() throws IOException {
        // 1、创建一个Properties集合对象
        Properties prop = new Properties();
        // 2、使用Properties集合对象中的方法load读取保存键值对的文件
//        prop.load(new FileReader("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter01/test1.txt"));
        prop.load(new FileInputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter01/test1.txt"));

        // 3、遍历Properties集合
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }


    }

    /*
        可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用
        void store(OutputStream out, String comments)
        void store(Writer writer, String comments)
        参数：
            OutputStream out：字节输出流，不能写入中文
            Writer writer ：字符输出流，可以写中文
            String comments：注释，用来解释说明保存的文件是干什么的
                不能使用中文，会产生乱码因为默认是Unicode编码
                一般使用""空字符串
            使用步骤：
                1、创建一个Properties集合对象，添加一些数据
                2、创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
                3、使用Properties集合中的方法store，把硬盘中保存的文件（键值对），读取到集合中使用
                4、释放资源

     */
    private static void show02() throws IOException {
        // 1、创建一个Properties集合对象，添加一些数据
        Properties prop = new Properties();
        prop.setProperty("张雯蔚","162");
        prop.setProperty("玮海琼","165");
        prop.setProperty("陈禧","163");

        /*// 2、创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
        FileWriter fw = new FileWriter("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter01/test1.txt");

        // 3、使用Properties集合中的方法store，把硬盘中保存的文件（键值对），读取到集合中使用
        prop.store(fw,"save data");

        // 4、释放资源
        fw.close();*/

        prop.store(new FileWriter("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter01/test1.txt"), "");
        prop.store(new FileOutputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter01/test2.txt"), "");

    }

    /*
        使用Properties集合存储数据，遍历取出Properties集合中的数据
        Properties集合是一个双列集合，key和value默认都是字符串
        Properties集合含有一些操作字符串的特有方法
            setProperty(String key, String value)调用HashTable的方法put
            String getProperty(String key)通过key找到value值，此方法相当于Map集合中的get(key)方法
            Set<String> stringPropertyNames()返回此属性列表中的键集，其中该键及其对应值是字符串，此方法相当于Map集合中的keySet方法

     */
    private static void show01() {
        // 创建Properties集合对象
        Properties prop = new Properties();
        // 使用setProperty往集合中添加数据
        prop.setProperty("张雯蔚","162");
        prop.setProperty("玮海琼","165");
        prop.setProperty("陈禧","163");

        // 使用stringPropertyNames把Properties集合中的键取出，存储到Set集合中
        Set<String> set = prop.stringPropertyNames();

        // 遍历set集合，取出Properties集合的每一个键
        for (String key : set) {
            // 使用getProperty方法通过key获取value
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }


    }

}
