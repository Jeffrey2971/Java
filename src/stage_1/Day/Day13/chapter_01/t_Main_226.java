package stage_1.Day.Day13.chapter_01;

public class t_Main_226 {
    public static void main(String[] args) {
        // 创建英雄角色
        t_Hero_224 hero = new t_Hero_224();

        // 为英雄起名，并设置年龄
        hero.setName("伽罗");
        hero.setAge(20);

        // 创建一个武器对象
        t_Weapon_225 weapon = new t_Weapon_225("长弓");

        // 给英雄配备武器
        hero.setWeapon(weapon);
        hero.attack();

    }
}
