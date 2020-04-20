package stage_1;

/*
数组元素的反转：
本来的样子：[1,2,3,4]
之后的样子：[4,3,2,1]

要求：不能使用新数组，使用原来的数组

        /*
        初始化语句：int min = 0,max = array.lenght - 1
        条件判断：min < max
        步进表达式：min++,max--
        循环体：用第三个变量倒手
         */

public class t_ArrayReverse_53 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

}

