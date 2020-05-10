package Lproject.NoteBookUSB;



// 键盘就是一种USB设备
public class t_Keyboard_202 implements stage_1.Lproject.NoteBookUSB.t_USB_199 {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");

    }
    public void type(){
        System.out.println("键盘输入");
    }
}
