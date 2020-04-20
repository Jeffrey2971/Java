package stage_1;
/*
永远停不下来的循环，叫做死循环，可能是无意也可能是有意
死循环的标准格式
while(true){
    循环体
}
 */
public class t_DieLoop_29 {
    public static void main(String[] args){
        t1(); // 无意
        t2(); // 有意
    }
    public static void t1(){
        for(int i = 1;i<=10; /*i++*/){
            System.out.println("我怎么停不下来了？？");
        }
    }

    public static void t2(){
        while (true){
            System.out.println("我就是不想停下来");
        }
    }
}
