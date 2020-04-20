package stage_1.Day.Day13.chapter_01;


// 游戏当中的英雄角色类
public class t_Hero_224 {
    private String name; // 英雄名字
    private int age; // 英雄的年龄
    private t_Weapon_225 weapon; // 武器

    public t_Hero_224() {
    }

    public void attack(){
        System.out.println("年龄为" + age + "的" + name + "拿着" + weapon.getCode() + "攻击了敌方！");
    }

    public t_Hero_224(String name, int age, t_Weapon_225 weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public t_Weapon_225 getWeapon() {
        return weapon;
    }

    public void setWeapon(t_Weapon_225 weapon) {
        this.weapon = weapon;
    }
}

