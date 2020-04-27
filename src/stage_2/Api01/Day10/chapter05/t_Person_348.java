package Api01.Day10.chapter05;

/*
    序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
    通过java.io.Serializable接口以启用序列化功能，未实现此接口的类无法使用其他任何状态的序列化或反序列化
    Serializable接口也叫标记型接口
        要进行序列化和反序列化的类必须实现Serializable接口，就会给这个类添加一个标记，当进行序列化和反序列化的时候，就会检测类上是否有这个标记
            有：可序列化和反序列化
            没有：NotSerializableException
    去市场卖肉-->肉上都有一个蓝色的章（检测合格）-->放心使用-->买回来怎么吃随意
 */

import java.io.Serializable;

public class t_Person_348 implements Serializable {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "t_Person_348{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public t_Person_348(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public t_Person_348() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
