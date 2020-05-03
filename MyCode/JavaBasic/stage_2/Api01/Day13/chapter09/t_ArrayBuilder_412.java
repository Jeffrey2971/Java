package Api01.Day13.chapter09;

/*
    定义一个创建数组的函数式接口
 */
@FunctionalInterface
public interface t_ArrayBuilder_412 {
    // 定义一个创建int类型数组的方法，参数传递数组的长度，返回创建好的int类型数组
    abstract int[] BuilderArray(int length);
}
