package stage_1.Extends.Extends_07;

/*
继承关系中，父子类构造方法的特点：

1、子类构造方法当中有一个默认隐藏的super()调用，所以一定是先调用父类的构造，后执行的子类构造
2、可以通过super关键字来子类调用父类重载构造
3、super的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造使用多次super构造
4、子类必须调用父类构造方法，不谢则赠送super()，写了则使用指定的super调用，super只能有一个且必须是第一个

 */

public class t_Constructor_133 {
    public static void main(String[] args) {

    t_Zi_135 zi = new t_Zi_135();
    }

}
