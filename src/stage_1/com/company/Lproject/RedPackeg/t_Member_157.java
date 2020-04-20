package stage_1.com.company.Lproject.RedPackeg;

import com.stage_1.Lproject.RedPackeg.t_User_155;

import java.util.ArrayList;
import java.util.Random;


// 普通成员
public class t_Member_157 extends t_User_155 {
    public t_Member_157() {
    }

    public t_Member_157(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        // 从多个红包当中随机抽取一个给自己
        // 随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        // 根据索引，从集合当中删除，并且得到被删除的红包给到自己
        Integer delta = list.remove(index);
        // 当前成员自己本来有多少钱
        int money = super.getMoney();
        // 加法，并且重新设置回去
        super.setMoney(money + delta);


    }


}
