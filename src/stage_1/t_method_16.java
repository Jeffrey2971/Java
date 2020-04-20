package stage_1;

/*
定义一个方法格式：
    public static void 方法名称() {
    方法体
    }
方法名称的命名规则和变量一样，使用小驼峰，
方法体：大括号当中可以包含任意一条语句

注意事项：
    1、方法定义的先后顺序无所谓
    2、方法的定义不能产生嵌套包含关系
    3、方法定义好后，不会执行类似Python的def，一定需要进行调用

调用格式：方法名称();
 */
public class t_method_16 {
    public static void main(String[] args) {
        farmer();
        seller();
        cook();
        me();

    }

    // 我
    public static void me() {
        System.out.println("吃");
    }

    // 农民
    public static void farmer() {
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("收割");
        System.out.println("卖给商贩");
    }

    // 商贩
    public static void seller() {
        System.out.println("运输到农贸市场");
        System.out.println("抬高价格");
        System.out.println("吆喝");
        System.out.println("卖个厨子");
    }

    // 厨子
    public static void cook() {
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }


}
