package Api01.Day13.chapter06;

/*
    定义子类
 */

public class t_Zi_407 extends t_Fu_406{
    // 重写父类方法sayHello的方法

    @Override
    public void sayHello() {
        System.out.println("Hello，我是儿子");
    }

    // 定义一个方法，参数传递Gettable
    public void method(t_Gettable_405 g){
        g.greet();

    }

    public void show(){
        // 调用method方法，方法的参数gettable是一个函数式接口所以可以传递lambda表达式
        /*method(()->{
            // 创建父类对象
            t_Fu_406 f = new t_Fu_406();

            // 调用父类的sayHello方法
            f.sayHello();
        });*/

        // 因为有子父类关系，所以存在一个关键字supper，代表父类，所以可以直接supper调用父类的成员方法
        // method(()->super.sayHello());
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new t_Zi_407().show();
    }
}
