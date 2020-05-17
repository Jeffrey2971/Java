package jsoup;


import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * xpath查询
 */
public class Jsoup_xpath {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        // 1、获取student.xml的path
        String path = Jsoup_xpath.class.getClassLoader().getResource("student.xml").getPath();
        // 2、获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        // 根据Document对象，创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        // 结合xpath的语法查询
            // 查询所有的student标签
        /*List<JXNode> jxNodes1 = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes1) {
            System.out.println(jxNode);
            System.out.println("-------------------");
        }*/
        System.out.println("-----------------");
            // 查询所有student标签下的name标签
        /*List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
            System.out.println("----------------------");
        }*/
        System.out.println("----------------------");
            // 查询student标签下带有id属性的name标签
        /*List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
            System.out.println("----------------------");
        }*/
            // 查询student标签下带有id属性的name标签并且id属性值为a
        List<JXNode> jxNodes4 = jxDocument.selN("//student/name[@id='c']");
        for (JXNode jxNode : jxNodes4) {
            System.out.println(jxNode);
            System.out.println("----------------------");
        }



    }

}
