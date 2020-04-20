package stage_2.Api01.Day03.chapter01;

public class t_Student_258 {
    private String name;
    private int age;

    public t_Student_258() {
    }

    @Override
    public String toString() {
        return "t_Student_258{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public t_Student_258(String name, int age) {
        this.name = name;
        this.age = age;
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
