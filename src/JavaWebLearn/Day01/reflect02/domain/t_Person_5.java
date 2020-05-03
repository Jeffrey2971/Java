package JavaWebLearn.Day01.reflect02.domain;

public class t_Person_5 {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "t_Person_5{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public t_Person_5(String name, int age) {
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

    public t_Person_5() {
    }
}
