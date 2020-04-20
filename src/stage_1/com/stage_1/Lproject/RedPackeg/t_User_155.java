package stage_1.com.stage_1.Lproject.RedPackeg;

public class t_User_155 {
    private String name; // 姓名
    private int money; // 余额，当前用户拥有的钱

    public t_User_155() {
    }

    public t_User_155(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // 展示一下当前用户的余额
    public void show(){
        System.out.println("我叫" + name + "我有余额：" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
