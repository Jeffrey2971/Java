package jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

/**
 * xpath查询
 */
public class Jsoup_xpath {
    public static void main(String[] args) throws IOException {
        // 1、获取student.xml的path
        String path = Jsoup_xpath.class.getClassLoader().getResource("student.xml").getPath();
        // 2、获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");


    }

}
