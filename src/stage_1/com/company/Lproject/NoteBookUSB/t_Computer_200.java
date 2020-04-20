package stage_1.com.company.Lproject.NoteBookUSB;

import Lproject.NoteBookUSB.t_Keyboard_202;

public class t_Computer_200 {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }

    // 使用USB设备的方法，使用接口作为方法的参数
    public void useDevice(com.company.Lproject.NoteBookUSB.t_USB_199 usb){
        usb.open(); // 打开设备
        if (usb instanceof t_Mouse_201){
            t_Mouse_201 mouse = (t_Mouse_201) usb;
            mouse.click();
        } else if(usb instanceof t_Keyboard_202){
            t_Keyboard_202 keyboard = (t_Keyboard_202) usb; // 向下转型
            keyboard.type();
        }
        usb.close(); // 关闭设备
    }
}
