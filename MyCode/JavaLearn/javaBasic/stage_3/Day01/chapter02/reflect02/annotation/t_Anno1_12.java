package stage_3.Day01.chapter02.reflect02.annotation;

/**
 * 注解javadoc演示
 *
 * @author jeffrey
 * @version 1.0
 * @since 1.5
 */

@SuppressWarnings("all") // 压制所有警告
public class t_Anno1_12 {
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public void show1(){
        // 有缺陷
    }


    public void show2(){
        // 替代shou1方法
    }

    public void demo(){
        show1();
    }

}
