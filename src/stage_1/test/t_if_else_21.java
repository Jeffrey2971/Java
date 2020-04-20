package stage_1.test;

/*
练习：
    指定考试成绩，判断成绩等级
        90 - 100 优秀
        80 - 89 好
        70 - 79 良
        60 - 69 及格
        60以下 不及格
 */
public class t_if_else_21 {
    public static void main(String[] args) {
        int score = 99;

        if (score <= 0 || score > 100) {
            System.out.println("成绩异常");
        } else if (score >= 90 && score <= 100) {
            System.out.println("你的成绩：优秀");
        } else if (score >= 80 && score <= 89) {
            System.out.println("你的成绩：好");
        } else if (score >= 70 && score <= 79) {
            System.out.println("你的成绩：良");
        } else if (score >= 60 && score <= 69) {
            System.out.println("你的成绩：及格");
        } else {
            System.out.println("你的成绩不及格");
        }

    }

}
