package stage_1.StaticField;



public class t_StaticStudent_107 {
    public static void main(String[] args) {
        // 首先设置一下教师，这是静态的东西，应该通过类名称进行调用
        t_Student_104.room = "1806";
        t_Student_104 one = new t_Student_104("张雯蔚", 20);
        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教师："+ t_Student_104.room);
        System.out.println("===========================");
        t_Student_104 two = new t_Student_104("玮海琼", 21);
        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教师："+ t_Student_104.room);



    }
}
