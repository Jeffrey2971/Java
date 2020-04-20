package stage_1.Day.Day_12.chapter_04;

public class t_InnerClass_218 {
    public static void main(String[] args) {
        // 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        t_Outer_217.Inner obj = new t_Outer_217().new Inner();
        obj.methodInner();
    }
}
