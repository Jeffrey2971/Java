package stage_1.com.company.Lproject.NoteBookUSB;

import Lproject.NoteBookUSB.t_Keyboard_202;

public class t_Main_203 {
    public static void main(String[] args) {
        // 创建一电脑
        com.company.Lproject.NoteBookUSB.t_Computer_200 computer = new com.company.Lproject.NoteBookUSB.t_Computer_200();

        computer.powerOn(); // 开机
        // 准备一个鼠标，供电脑使用
//        t_Mouse_201 mouse = new t_Mouse_201();
        // 首先进行向上转型
        com.company.Lproject.NoteBookUSB.t_USB_199 usbMouse = new t_Mouse_201(); //多态写法

        computer.useDevice(usbMouse); // 参数是USB类型，正好传递进去的就是USB鼠标

        // 创建一个USB键盘
        t_Keyboard_202 keyboard = new t_Keyboard_202(); // 没有使用多态写法

        // 方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard); //正确，发生了向上转型
        computer.useDevice(new t_Keyboard_202()); // 也是正确写法

        computer.powerOff(); // 关机


        System.out.println("---------------------------------");
        method(10.0); // 正确，double --> double
        method(20); // 正确，int --> double

    }
    public static void method(double num){
        System.out.println(num);
    }
}
