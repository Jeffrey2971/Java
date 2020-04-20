package stage_1.oriented.Anonymous;

/*
创建对象的标准格式：
类名称 对象名 = new 类名称(参数);

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new 类名称();

注意事项：匿名对象只能使用唯一的一次，下次如需使用需要再创建一个新的对象
使用建议：如果确定只有一个对象只需要使用唯一的一次，就可以使用匿名对象

 */

public class t_Anonymous_80 {
    public static void main(String[] args) {
        // 左边的one就是对象的名字
        t_Person_81 one = new t_Person_81();
        one.name = "张稳稳";
        one.showName();
        System.out.println("=====================");

        // 匿名对象
        new t_Person_81().name = "张雯雯";
        new t_Person_81().showName(); // 你叫null
    }

}
