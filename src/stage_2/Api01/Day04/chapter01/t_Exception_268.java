package stage_2.Api01.Day04.chapter01;

/*
异常的产生过程解析（分析异常是怎么产生的并如何处理异常）
    已画图
 */

public class t_Exception_268 {
    public static void main(String[] args) {
        // 创建int类型的数组并赋值
        int[] array = {1, 2, 3, 4, 5};
        int result = getElement(array, 5);
        System.out.println(result);

    }

    /*
        定义一个方法，获取数组指定索引处的元素
        参数：
            int[] array
            int index
     */
    public static int getElement(int[] array, int index) {
        int ele = array[index];
        return ele;
    }
}
