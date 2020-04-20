package stage_1.oriented.phone;

public class t_phoneParam_64 {
    public static void main(String[] args) {
        t_phone_60 one = new t_phone_60();
        one.brand = "苹果";
        one.brand = "1000";
        one.brand = "Black";

        method(one); // 传递进去的参数其实就是地址值

    }

    public static void method(t_phone_60 param){
        System.out.println(param.brand); // 苹果
        System.out.println(param.price); // 1000
        System.out.println(param.color); // Black

    }
}
