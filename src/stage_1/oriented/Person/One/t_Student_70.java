package stage_1.oriented.Person.One;

/*
对于基本类型当中的boolean值，Getter方法一定要携程isXxx的形式，而setXxx规则不变。
 */



public class t_Student_70 {
    private String name; // 姓名
    private int age; // 年龄
    private boolean male; // 是否为男性

    public void setMale(boolean b ){
        male = b;
    }

    public boolean isMale(){
        return male;
    }


    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;

    }

    public void setAge(int num) {
        age = num;

    }

    public int getAge() {
        return age;
    }
}
