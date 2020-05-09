package stage_3.Day01.chapter02.reflect02.annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;

/**
 * - 元注解：用于描述注解的注解
 * - 元注解：用于描述注解的注解
 * - @target
 * - 描述注解能够作用的位置
 * - @Retention
 * - 描述注解被保留的一个阶段
 * - @Documented
 * - 描述注解是否被抽取到API文档中
 * - @Inherited
 * - 描述是否被子类继承
 */
// 表示该MyAnno3这个注解只能作用于类上
@Target(value = {ElementType.TYPE, METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface t_MyAnno_17 {


}
