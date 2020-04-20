package stage_1.Day.Day_12.chapter_02;

/*
当final关键字用来修饰一个方法的时候，这个方法就是最终方法，不能被覆盖重写，格式：
修饰符 final 返回值类型 犯法名称(参数列表){
    // 方法体
}

注意事项：
对于类，还有方法来说，abstract关键字和final关键字不能同时使用，因为矛盾关系。
 */

public abstract class t_Fu_206 {
    public final void method(){
        System.out.println("父类方法执行");
    }

    public abstract /*final*/ void methodAbs();
}
