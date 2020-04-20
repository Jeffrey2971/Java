package stage_1.com.company.Lproject.NoteBookUSB;

// 鼠标就是一种USB设备
public class t_Mouse_201 implements com.company.Lproject.NoteBookUSB.t_USB_199 {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");

    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
