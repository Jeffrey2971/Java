/*
package stage_1.com.company.Lproject.RedPackeg;

import com.stage_1.Lproject.RedPackeg.t_User_155;

import java.util.ArrayList;

// 群主的类

public class t_Manager_156 extends t_User_155 {
    public t_Manager_156(){
        // super()
    }

    public t_Manager_156(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        // 首先序号集合，用于存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        // 首先看一下群主自己有多少钱
        int LeftMoney = super.getMoney(); // 群主当前的余额
        if (totalMoney > LeftMoney){
            System.out.println("余额不足");
            return redList; // 返回空集合
        }
        // 扣钱，从余额扣，其实就是重新设置余额
         super.setMoney(LeftMoney - totalMoney);

        // 发红包，需要品均拆分为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; // 余数，也就是甩下的零头

        //除不开的零头，包在最后一个红包当中
        // 下面把红包一个个放到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);

        }

        // 最后一个红包
        int last = avg + mod;
        redList.add(last);
    return redList;
    }
}
*/
