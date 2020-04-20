package stage_1;

public class t_ArrayMax_51 {
    public static void main(String[] args) {
        int[] array = {5,15,30,1222,321}; // len 5
        int max = array[0];
        for (int i = 1;i < array.length;i++){
            // 如果当前元素比max更大，则替换
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值为：" + max);
    }
}
