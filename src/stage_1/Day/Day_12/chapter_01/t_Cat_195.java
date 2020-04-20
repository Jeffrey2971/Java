package stage_1.Day.Day_12.chapter_01;

public class t_Cat_195 extends t_Animal_194 {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 子类特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
