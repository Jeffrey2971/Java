package stage_1.StaticField;

public class t_Student_104 {

    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0; // 学好计数器，每当new了一个新的对象的时候，计数器++

    public t_Student_104(){
        idCounter++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public t_Student_104(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
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
