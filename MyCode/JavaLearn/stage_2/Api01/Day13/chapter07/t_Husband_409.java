package Api01.Day13.chapter07;

/*
    通过this引用本类的成员方法
 */

public class t_Husband_409 {
    // 定义一个买房子的方法
    public void buyHouse() {
        System.out.println("在北京二环内买了五套四合院");
    }

    // 定义一个结婚的方法，参数传递reachable接口
    public void marry(t_Reachable_408 r){
        r.buy();
    }

    // 定义一个高兴的方法
    public void Happy(){
        // 调用结婚的方法，方法的参数reachable是一个函数式接口，所以可以传递lambda表达式
        marry(()->{
            // 使用this.成员方法,调用本类买房子的方法
            this.buyHouse();
        });

        /*
            使用方法引用优化lambda
            this是已经存在的
            本类的成员方法buyHouse也已经存在
            所以可以直接使用this引用本类的成员方法buyHouse
         */
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new t_Husband_409().Happy();
    }
}
