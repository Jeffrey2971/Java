package stage_3.Day01.chapter02.reflect02.demo;

public class t_Calculator_23 {


    // 加法
    @t_Check_24
    public void add() {
        String str = null;
        str.toString();
        System.out.println("1+0 = " + (1 + 0));
    }
    //减法
    @t_Check_24
    public void sub() {
        System.out.println("1 - 0 =" + (1 - 0));
    }
    //乘法
    @t_Check_24
    public void mul() {
        System.out.println("1 * 0 =" + (1 * 0));
    }
    //除法
    @t_Check_24
    public void div() {
        System.out.println("1 / 0 =" + (1 / 0));
    }

    public void show(){
        System.out.println("永无bug...");
    }
}
