package StageTwo.day07ooday01;

public class Student {
    String name;
    int age;
    String className;
    String stuId;
    //重构  构造方法
    Student(){
    }
    //this访问的一定是成员变量   局部变量不能用this
    //成员变量和局部变量是可以同名的，使用的时候采取的是就近原则，此时若想访问成员变量，则this不能省略

    /**
     * this.成员变量名   -访问成员变量
     * this.方法名       -访问方法（很少用）
     * this()           -调用构造方法
     */
    Student(String name, int age, String className, String stuId) {
        this.name=name;
        this.age=age;
        this.className=className;
        this.stuId=stuId;
    }
    void study() {
        System.out.println(this.name+"正在学习");
    }
    void sayHi(){
        System.out.println("你好！我是"+this.name+",今年"+this.age+"岁，所在班级是"+this.className+"，学号是"+this.stuId+"。");
    }
    void play(String other) {
        System.out.println(other+"正在和"+this.name+"玩");
    }
}
