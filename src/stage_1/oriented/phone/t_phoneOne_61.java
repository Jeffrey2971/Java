package stage_1.oriented.phone;

public class t_phoneOne_61 {
    public static void main(String[] args) {
        // 根据phone类，创建一个名为one的对象
        // 格式：类名称 = 对象名 = new 类名称();
        t_phone_60 one = new t_phone_60();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null
        System.out.println("=====================");
        one.brand = "Apple";
        one.price = 10000;
        one.color = "Black";
        System.out.println(one.brand); //
        System.out.println(one.price); //
        System.out.println(one.color); //
        System.out.println("=====================");
        one.call("乔布斯");
        one.sendMessage();

    }
}
