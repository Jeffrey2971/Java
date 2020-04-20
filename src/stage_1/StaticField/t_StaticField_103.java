package stage_1.StaticField;

/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享一份数据
 */
public class t_StaticField_103 {
    public static void main(String[] args) {


        t_Student_104 two = new t_Student_104("玮海琼",20);
        two.room = "1806教室";
        System.out.println("姓名："+ two.getName() + "，年龄："
                + two.getAge() + "教师：" + two.room + "，学号：" + two.getId());
        t_Student_104 one = new t_Student_104("张雯蔚",19);
        System.out.println("姓名："+ one.getName() + "，年龄："
                + one.getAge() + "教师：" + one.room + "，学号：" + one.getId());
    }
}
