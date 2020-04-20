package stage_1.oriented.ArrayOriented;

/*
题目：定义一个数组，用来储存三个Person对象
数组有一个缺点：一旦创建，程序运行期间长度不可改变
 */

public class t_ArrayOriented_87 {
    public static void main(String[] args) {
        // 首先创建一个长度为三的数组，里边用于存放Person类型的对象
        t_Person_88[] array = new t_Person_88[3];
        t_Person_88 one = new t_Person_88("张雯雯", 18);
        t_Person_88 two = new t_Person_88("张文文", 20);
        t_Person_88 three = new t_Person_88("张张张", 22);

        // 将one当中的地址值赋值到数组的0号位置
        array[0] = one;
        array[1] = two;
        array[2] = three;


        System.out.println(array[0]); // 地址值
        System.out.println(array[1]); // 地址值
        System.out.println(array[2]); // 地址值

        System.out.println(array[1].getName()); // 张文文
    }


}
