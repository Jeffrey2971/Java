package stage_1.oriented.Person.One;

public class t_Person_69 {
    public static void main(String[] args) {
        t_Person_68 person = new t_Person_68();
        person.show();
        person.name = "张文伟";
//        person.age = 19; 直接访问private内容，错误写法！
        person.setAge(20);
        person.show();
    }
}
