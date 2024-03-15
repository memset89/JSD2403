package homeWork;

/**
 * Student类：name，age，className，stuId，构造方法()，study()，sayHi()，playWith(String anotherName)
 *
 * StudentTest类：创建对象，访问测试
 */
public class Student {
    String name;
    int age;
    String className;
    String stuId;
    Student() {

    }
    Student(String name, int age, String className, String stuId) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.stuId = stuId;
    }
    void study() {
        System.out.println(name+"在学习");
    }
    void sayHi() {
        System.out.println("大家好，我叫"+name+"，我今年"+age+"岁了，我的班级是"+className+"，我的学号是"+stuId);
    }
    void play(String other) {
        System.out.println(name+"在和"+other+"玩");
    }

}
