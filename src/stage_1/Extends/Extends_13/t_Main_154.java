package stage_1.Extends.Extends_13;

public class t_Main_154 {
    public static void main(String[] args) {

//        t_Animal_150 animal = new t_Animal_150(); 错误写法
//        t_Dog_151 dog = new t_Dog2Ha_153();  错误写法，这也是抽象类
        t_Dog2Ha_153 ha = new t_Dog2Ha_153(); // 不会报错，因为是普通类可以直接new
        ha.eat();
        ha.sleep();
        System.out.println("==================");
        t_DogGolden_152 golden = new t_DogGolden_152();
        golden.eat();
        golden.sleep();

    }
}
