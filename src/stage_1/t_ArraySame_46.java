package stage_1;
public class t_ArraySame_46 {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA); //地址值
        System.out.println(arrayA[0]); //0
        System.out.println(arrayA[1]); //0
        System.out.println(arrayA[2]); //0
        System.out.println("======================"); //0
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA); //地址值
        System.out.println(arrayA[0]); //0
        System.out.println(arrayA[1]); //10
        System.out.println(arrayA[2]); //20
        System.out.println("======================"); //0
        // 将arrayA的数组织赋值给arrayB数组
        int[] arrayB = arrayA;
        System.out.println(arrayB); //地址值
        System.out.println(arrayB[0]); //0
        System.out.println(arrayB[1]); //10
        System.out.println(arrayB[2]); //20
        System.out.println("======================"); //0
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB); //地址值
        System.out.println(arrayB[0]); //0
        System.out.println(arrayB[1]); //100
        System.out.println(arrayB[2]); //200
    }
}
