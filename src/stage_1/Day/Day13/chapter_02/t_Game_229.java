package stage_1.Day.Day13.chapter_02;

public class t_Game_229 {
    public static void main(String[] args) {
        t_Hero_227 hero = new t_Hero_227();
        hero.setName("伽罗");
        hero.setSkill(new t_SkillImpl_230()); // 使用单独定义的实现类

        // 还可使用改成匿名内部类
//        t_Skill_228 skill = new t_Skill_228() {
//            @Override
//            public void use() {
//                System.out.println("啊啊 啊 啊啊啊啊啊 a ");
//            }
//        };
//        hero.setSkill(skill);

        // 进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new t_Skill_228() {
            @Override
            public void use() {
                System.out.println("啊啊啊啊啊啊");
            }
        });
        hero.attack();
    }
}
