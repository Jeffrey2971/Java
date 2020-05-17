package jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Element对象
 */
public class JsoupDemo04 {
    public static void main(String[] args) throws IOException {
        // 1、获取student.xml的path
        String path = JsoupDemo04.class.getClassLoader().getResource("student.xml").getPath();
        // 2、获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");

        /*
        - Element：元素对象
            - 获取子元素对象
                  - getElementById(String id)：根据ID属性值获取唯一的Element对象
                  - getElementByTag(String tagName)：根据标签名称获取元素对象的集合
                  - getElementByAttribute(String key)：根据属性名称获取元素对象集合
                  - getElementByAttributeValue(String key, String value)：根据对应的属性名和属性值获取元素对象集合
            - 获取属性值
                - String attr(String key)：根据属性名称获取属性值
            - 获取文本内容
                - String text()：获取文本内容
                - String innerHTML()：获取标签体的所有内容(包括子标签的字符串内容)
         */

        // 通过Document对象获取name标签，可以获取到两个，获取所有的name标签
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        System.out.println("-----------------------");
        // 通过Element对象获取子标签对象
        Element element_student = document.getElementsByTag("student").get(0);
        Elements elements_name = element_student.getElementsByTag("name");
        System.out.println(elements_name.size());


    }

}
