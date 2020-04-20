package stage_1.review.day11.d_1;

public class Multi {
    public static void main(String[] args) {
        // 多态
        // 左侧父类的引用指向了右侧的对象
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
    }
}
