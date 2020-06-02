package web.test;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import web.domain.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class JacksonTest {
    // Java对象转为json字符串
    @Test
    public void test1() throws IOException {
        // 创建Person对象
        Person p = new Person();
        p.setName("mable");
        p.setAge(21);
        p.setGender("女");

        // 创建Jackson的核心对象   ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        // 转换
        /*
            转换方法
                writeValue(参数1, obj)：
                    - 参数1
                        - File：将obj对象转为json字符串，并保存到指定的文件中
                        - Writer：将obj对象转为json字符串，并将json数据填充到字符输出流中
                        - OutputStream：将obj对象转为json字符串，并将json数据填充到字节输出流中
                writeValueAsString(obj)：将对象转为json字符串
         */
        /*String json = mapper.writeValueAsString(p);
        System.out.println(json);*/

        // writerValue，将数据写到/home/jeffrey/json.txt文件中
        // mapper.``writeValue(new File("/home/jeffrey/json.txt"), p);

        // writeValue.将数据关联到Writer中
        mapper.writeValue(new FileWriter("/home/jeffrey/b.txt"), p);
    }


    @Test
    public void test2() throws IOException {
        // 创建Person对象
        Person p = new Person();
        p.setName("mable");
        p.setAge(21);
        p.setGender("女");
        p.setBirthday(new Date());

        // 转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);
        System.out.println(json);

    }

    @Test
    public void test3() throws IOException {
        // 创建Person对象
        Person p = new Person();
        p.setName("mable");
        p.setAge(21);
        p.setGender("女");
        p.setBirthday(new Date());

        Person p1 = new Person();
        p.setName("mable");
        p.setAge(21);
        p.setGender("女");
        p.setBirthday(new Date());

        Person p2 = new Person();
        p.setName("mable");
        p.setAge(21);
        p.setGender("女");
        p.setBirthday(new Date());

        // 创建List集合
        List<Person> ps = new ArrayList<Person>();
        ps.add(p);
        ps.add(p1);
        ps.add(p2);

        // 转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(ps);
        // [{"name":"mable","age":21,"gender":"女","birthday":"2020-05-30"},{"name":null,"age":0,"gender":null,"birthday":null},{"name":null,"age":0,"gender":null,"birthday":null}]
        System.out.println(json);

    }

    @Test
    public void test4() throws IOException {
        // 创建Map对象
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "mable");
        map.put("age", 21);
        map.put("gender", "女");

        // 转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);
        System.out.println(json);
    }

    @Test
    public void test5() throws IOException {
        // json字符串转为Java对象
            // 初始化json字符串
        String json = "{\"name\":\"mable\",\"age\":21,\"gender\":\"女\",\"birthday\":\"2020-05-30\"}";
            // 创建ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();
            // 转换为Java Person对象
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);


    }
}
