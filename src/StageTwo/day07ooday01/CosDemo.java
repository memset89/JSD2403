package StageTwo.day07ooday01;

public class CosDemo {
    public static void main(String[] args)
    {
        //创建对象
        Student s1 = new Student("张三", 18, "计算机科学与技术", "19990101001");
        Student s2 = new Student("李四", 20, "计算机科学与技术", "19990101002");
        Student s3 = new Student("王五", 19, "计算机科学与技术", "19990101003");
        Student s4 = new Student("赵六", 21, "计算机科学与技术", "19990101004");
        Student s5 = new Student("钱七", 22, "计算机科学与技术", "19990101005");
        Student s6 = new Student("孙八", 23, "计算机科学与技术", "19990101006");
        Student s7 = new Student("周九", 24, "计算机科学与技术", "19990101007");
        s7.sayHi();
    }
}
