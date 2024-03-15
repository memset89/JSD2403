package StageTwo.day07ooday01;
/*


int age=0;

 */

/**
 * 构造函数，构造器，构建器
 * 作用：给成员变量赋初始化
 * 语法：与类同名，没有返回值类型（void都没有）
 * 调用：在创建（new）对象时被自动调用
 * 若自己不写构造方法，则编译器会自动添加一个默认的构造器
 * 默认的构造器，参数为空
 * 若自己写了构造方法，则编译器不会添加默认的构造器
 * 则此时建议再写一个无参的构造器
 *
 */

public class StudentTest {

    public static void main(String[] args) {
        double age=0.4;
        Student s1=new Student();
        //Student s1=new Student("张三",18,"1801","180101" );
        s1.name="张三";
        s1.age=18;
        s1.className="1801";
        s1.stuId="180101";
        s1.study();
        s1.sayHi();
        s1.play("李四");
        Student s2=new Student("李四",19,"1801","180102");
        s2.sayHi();
    }
}
