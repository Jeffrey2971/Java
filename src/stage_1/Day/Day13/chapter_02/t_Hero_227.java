package stage_1.Day.Day13.chapter_02;

public class t_Hero_227 {
    private String name; // 英雄的名称
    private t_Skill_228 skill; // 英雄的技能

    public t_Hero_227() {
    }

    public t_Hero_227(String name, t_Skill_228 skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack(){
        System.out.println("我叫" + name + "，开始释放技能：");
        skill.use(); // 调用接口中的抽象犯法
        System.out.println("释放技能完成！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public t_Skill_228 getSkill() {
        return skill;
    }

    public void setSkill(t_Skill_228 skill) {
        this.skill = skill;
    }
}
