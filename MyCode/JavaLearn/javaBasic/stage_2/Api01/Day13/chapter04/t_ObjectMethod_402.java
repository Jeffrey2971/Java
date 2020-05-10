package Api01.Day13.chapter04;

/*
    通过对象名引用成员方法
    使用前提是对象名是已存在，成员方法也是已经存在
    就可以使用对象名来引用成员方法
 */

public class t_ObjectMethod_402 {
    // 定义一个方法，方法的参数传递printable接口
    public static void printString(t_Printable_401 p){
        p.print("HelloWorld");

    }

    public static void main(String[] args) {
        // 调用printString方法，方法的参数printable是一个函数式接口所以可以传递lambda表达式
        printString((s)->{
            // 创建MethodRerObject对象
            t_MethodRerObject_400 obj = new t_MethodRerObject_400();
            // 调用MethodRerObject对象中的成员方法printUpperCaseString，把字符串按照大写输出
            obj.printUpperCaseString(s);
        });

        /*
            使用方法引用优化lambda
            对象已经存在MethodRerObject
            成员方法也已经存在printUpperCaseString
            所以可以使用对象名来引用成员方法
         */
        t_MethodRerObject_400 obj = new t_MethodRerObject_400();
        printString(obj::printUpperCaseString);
    }
}
