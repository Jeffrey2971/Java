package stage_2.Api01.Day05.chapter01;

public class t_Person_283 {
    private String name;

    public void run(){
        // 定义一个循环，执行20次
        for (int i = 0; i <= 20; i++) {
            System.out.println(name + "-->" + i);
        }
    }



    public t_Person_283() {
    }

    public t_Person_283(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
