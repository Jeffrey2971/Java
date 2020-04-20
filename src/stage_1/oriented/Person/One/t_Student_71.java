package stage_1.oriented.Person.One;

public class t_Student_71 {
    public static void main(String[] args) {
        t_Student_70 stu  = new t_Student_70();
        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名"+ stu.getName());
        System.out.println("年龄"+ stu.getAge());
        System.out.println("性别"+ stu.isMale());
    }
}
