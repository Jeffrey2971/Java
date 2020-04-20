package stage_1;
/*
获取数组长度
格式：数组名称.length
这将会得到一个int数字，代表数组的长度
数组一旦创建，程序运行期间，长度不可改变
 */
public class t_ArrayLength_49 {
    public static void main(String[] args) {
        int[] arrayA = new int[10];
        int[] arrayB = {10, 20, 30, 40,123,124,12,45,134,23,123,123};
        int len = arrayB.length;
        System.out.println("arrayB的长度" + len);
        System.out.println("================");
        int[] arrayC = new int[3];
        System.out.println(arrayC.length); //3
        arrayC = new int[5];
        System.out.println(arrayC.length);

    }
}
