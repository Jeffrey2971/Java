package stage_1.oriented.Three;

public class t_Student_77 {
    public static void main(String[] args) {
        t_Student_76 stu1 = new t_Student_76();
        stu1.setName("张文伟");
        stu1.setAge(19);
        System.out.println("姓名：" + stu1.getName() + "，年龄：" + stu1.getAge());
        System.out.println("======================");
        t_Student_76 stu2 = new t_Student_76("张雯雯", 21);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        stu2.setAge(22);
        System.out.println("======================");
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());


    }
}
