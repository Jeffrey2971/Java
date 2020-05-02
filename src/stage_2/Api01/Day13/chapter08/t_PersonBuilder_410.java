package Api01.Day13.chapter08;

/*
    定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface t_PersonBuilder_410 {
    // 定义一个方法，根据传递的姓名创建Person对象
    t_Person_409 builderPerson(String name);
}
