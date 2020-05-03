package Api01.Day13.chapter08;

/*
    类的构造器（构造方法）引用
 */

public class t_Main_411 {
    // 定义一个方法，参数传递姓名好PersonBuilder接口，方法中通过姓名创建Person对象
    public static void PrintName(String name, t_PersonBuilder_410 p){
        t_Person_409 person = p.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        // 调用printName方法，方法的参数PersonBuilder接口是一个函数式接口，所以可以使用lambda
        PrintName("陈禧",(String name)->{
            return new t_Person_409(name);
        });

        /*
            使用方法引用，优化lambda
            已知构造方法new Person(name)
            已知对象 new
            可以使用Person引用new创建对象
         */
        PrintName("玮海琼",t_Person_409::new); // 使用Person类的代参构造方法，通过传递的姓名创建对象
    }
}
