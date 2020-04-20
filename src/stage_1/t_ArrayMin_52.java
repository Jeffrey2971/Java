package stage_1;

public class t_ArrayMin_52 {
    public static void main(String[] args) {
        int[] array = {5, 15, 30, 1222, 321, 1, 0, -20}; // len 5
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素比min更小，则替换
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("最小值为：" + min);
    }
}
