package stage_3.Day01.chapter02.reflect02.domain;

public class t_Person_5 {
    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;

    @Override
    public String toString() {
        return "t_Person_5{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
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

    public void eat(){
        System.out.println("eat...");
    }

    public void eat(String food){
        System.out.println("eat" + food);
    }

    public t_Person_5() {
    }
}
