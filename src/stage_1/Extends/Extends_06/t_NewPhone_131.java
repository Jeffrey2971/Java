package stage_1.Extends.Extends_06;

// 定义一个新手机，使用老手机作为父类

public class t_NewPhone_131 extends t_Phone_130 {
    @Override
    public void show() {
        super.show(); // 把父类的show方法拿过来重复利用
        // 自己的子类用于添加更多内容
        System.out.println("信息姓名");
        System.out.println("信息头像");
    }
}
