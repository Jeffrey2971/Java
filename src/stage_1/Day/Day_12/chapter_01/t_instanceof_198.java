package stage_1.Day.Day_12.chapter_01;

/*
如何才能知道一个父类引用的对象，本来是什么子类
格式：
对象 instanceof 类名称
这将得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例
 */

public class t_instanceof_198 {
    public static void main(String[] args) {
        t_Animal_194 animal = new t_Dog_197(); // 本来是一只猫
        animal.eat(); // 猫吃鱼

        // 如果希望调用子类特有方法，需要向下转型
        if (animal instanceof t_Dog_197){ // 判断一下父类引用animal本来是不是Dog
            t_Dog_197 dog = (t_Dog_197) animal;
            dog.watchHouse();
        }
        if (animal instanceof  t_Cat_195){ // 判断Animal本来是不是cat
            t_Cat_195 cat = (t_Cat_195) animal;
            cat.catchMouse();
        }
        gitMeAnPet(new t_Dog_197());

    }
    public static void gitMeAnPet(t_Animal_194 animal){
        if (animal instanceof t_Dog_197) {
            if (animal instanceof t_Dog_197){ // 判断一下父类引用animal本来是不是Dog
                t_Dog_197 dog = (t_Dog_197) animal;
                dog.watchHouse();
            }
            if (animal instanceof  t_Cat_195){ // 判断Animal本来是不是cat
                t_Cat_195 cat = (t_Cat_195) animal;
                cat.catchMouse();
            }
        }

    }
}
