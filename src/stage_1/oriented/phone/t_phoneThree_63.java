package stage_1.oriented.phone;

public class t_phoneThree_63 {
    public static void main(String[] args) {

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

        System.out.println("=====================");


        // 将one当中保存的恩对象地址值赋值给two
        t_phone_60 two = one;
        System.out.println(two.brand); // null
        System.out.println(two.price); // 0.0
        System.out.println(two.color); // null
        System.out.println("=====================");
        two.brand = "三星";
        two.price = 9999;
        two.color = "BLue";
        System.out.println(two.brand); //三星
        System.out.println(two.price); //9999
        System.out.println(two.color); //BLue
        System.out.println("=====================");
        two.call("欧巴");
        two.sendMessage();

    }
}
