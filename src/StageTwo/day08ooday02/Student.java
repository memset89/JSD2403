package StageTwo.day08ooday02;

public class Student extends Person {
    String className;
    String stuId;
    String name;

    Student() {

    }

    Student(String className, String stuId, String name, int age, String address) {
        this.className = className;
        this.stuId = stuId;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student(String tom, int i, String china) {
    }

    void sayHi() {
        System.out.println("你好");
    }

    void play(String other) {
        System.out.println(name + "和" + other + "在玩");
    }

    void study() {
        System.out.println("学习");
    }
}
