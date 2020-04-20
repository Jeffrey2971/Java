package stage_2.Api01.Day03.chapter01;

public class t_Person_256 implements Comparable<t_Person_256>{
    private String name;
    private int age;

    public t_Person_256() {
    }

    public t_Person_256(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "t_Person_256{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    // 重写排序的规则
    @Override
    public int compareTo(t_Person_256 a) { // a代表当前集合中的方法
        // return 0;  认为元素都是相同的
        // 自定义比较的规则，比较两个人的年龄（this,参数Person）
        return this.getAge() - a.getAge(); // 年龄升序排序
//        return a.getAge() - this.getAge(); // 年龄降序排序
    }
}
