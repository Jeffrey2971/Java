package stage_1.oriented.phone;

public class t_phoneReturn_65 {
    public static void main(String[] args) {
        t_phone_60 two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static t_phone_60 getPhone(){
        t_phone_60 one = new t_phone_60();
        one.brand = "Apple";
        one.price = 8388;
        one.color = "土豪金";
        return one;
    }
}
