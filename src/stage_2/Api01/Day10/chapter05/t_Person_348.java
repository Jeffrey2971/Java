package Api01.Day10.chapter05;

/*
    序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
    通过java.io.Serializable接口以启用序列化功能，未实现此接口的类无法使用其他任何状态的序列化或反序列化
    Serializable接口也叫标记型接口
        要进行序列化和反序列化的类必须实现Serializable接口，就会给这个类添加一个标记，当进行序列化和反序列化的时候，就会检测类上是否有这个标记
            有：可序列化和反序列化
            没有：NotSerializableException
    去市场卖肉-->肉上都有一个蓝色的章（检测合格）-->放心使用-->买回来怎么吃随意

    static关键字：静态关键字
        作用：静态优先与非静态优先于加载到内存中（静态优先于对象进入到内存中）
        被static修饰的成员变量是不能被序列化的，序列化的都是对象

        private static int age;
        oos.writeObject(new t_Person_348("张雯蔚",20));
        Object o = ois.readObject();
        t_Person_348{name='张雯蔚', age=0}

    transient关键字：瞬态关键字
        被transient修饰的成员变量，不能被序列化
        private transient int age;
        oos.writeObject(new t_Person_348("张雯蔚",20));
        Object o = ois.readObject();
        t_Person_348{name='张雯蔚', age=0}
 */

import java.io.Serializable;

public class t_Person_348 implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
    // private transient int age;
    public int age;

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
