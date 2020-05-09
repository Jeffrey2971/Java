package stage_3.Day01.chapter02.reflect02.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  描述需要执行的类名和方法名
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)

public @interface t_Pro_20 {
    String className();
    String methodName();

}

/*
    其实就是在内存中去生成了一个该注解接口的子类实现对象
    public class ProImpl implement pro{
        public String className(){
            return "JavaWebLearn.Day01.chapter02.reflect02.annotation.t_Test_21";
        }
        public String methodName(){}
            return "show";
    }
 */