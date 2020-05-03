package Api01.test.test.chapter02;

/*

 */

public class t_Person_314 {
    private String name;
    private int age;

    public t_Person_314(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "t_Person_314{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public t_Person_314() {
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
