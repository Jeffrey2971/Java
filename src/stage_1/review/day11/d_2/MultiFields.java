package stage_1.review.day11.d_2;

public class MultiFields {
    public static void main(String[] args) {
        // 使用多态，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num); // 等号左边是Fu所以是10
//        System.out.println(obj.age); 错误写法，父类当中没有age，根据规则向上找，上面是Object，不会向下找
        System.out.println("-----------------------");
        // 子类没有覆盖重写就是Fu
        // 子类如果覆盖重写了就是Zi
        // 谁重新覆盖重写了则方法属于谁


    }
}
