package stage_1;
/*
和break不同的是，continue是另一种循环控制语句
一旦执行，将立刻跳过当前次循环剩余内容，马上开始下一次循环
 */
public class t_continue_28 {
    public static void main(String[] args){
        for (int i = 1;i <=10; i++) {
            if (i ==4){
                continue;
            }
            System.out.println(i+"层到了");
        }
    }
}
