package Api01.Day10.chapter05;

public class t_Person_348 {
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
