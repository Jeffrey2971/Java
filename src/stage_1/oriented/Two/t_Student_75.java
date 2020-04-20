package stage_1.oriented.Two;

public class t_Student_75 {
    public static void main(String[] args) {
        t_Student_74 stu1 = new t_Student_74(); // 无参构造
        System.out.println("======================");
        t_Student_74 stu2 = new t_Student_74("张文伟", 20); // 全餐构造
        System.out.println("姓名是：" + stu2.getName() + ", 年龄是：" + stu2.getAge());
        // 如果需要改变对象当中的成员变量，仍然还需要使用setXxx方法
        stu2.setAge(21); // 改变年龄
        System.out.println("姓名是：" + stu2.getName() + ", 年龄是：" + stu2.getAge());


    }
}
