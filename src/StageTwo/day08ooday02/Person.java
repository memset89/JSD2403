package StageTwo.day08ooday02;
//继承 ：实现代码复用   (超类，基类，父类)
class Person {
    String name="sss";
    int age;
    String address;
    Person(){}
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void eat() {
        System.out.println("吃饭");
    }
    void sleep() {
        System.out.println("睡觉");
    }

}
class Student extends Person {
    String className;
    String stuId;
    String name;
    Student() {

    }
    Student(String className, String stuId, String name, int age, String address) {
        this.className = className;
        this.stuId = stuId;
        super.name = name;
        this.age = age;
        this.address = address;
    }

    void sayHi() {
        System.out.println("你好");
    }
    void play(String other) {
        System.out.println(name+"和" + other + "在玩");
    }
    void study() {
        System.out.println("学习");
    }
}
class Doctor extends Person {
    String title;
    String name;
    //String cut;
    Doctor() {

    }
    Doctor(String title, String name, int age, String address) {
        this.title = title;
        super.name = name;
        this.age = age;
        this.address = address;
    }
    void sayTitle() {
        System.out.println("你好,我的职称是"+title);
    }
}
class Teacher extends Person {
    String className;
    String teacherId;
    Teacher() {

    }
    Teacher(String className, String teacherId, String name, int age, String address) {
        this.className = className;
        this.teacherId = teacherId;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void teach() {
        System.out.println("老师上课");
    }
}

