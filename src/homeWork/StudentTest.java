package homeWork;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, "计算机科学与技术", "19990101001");
        Student s2 = new Student("李四", 20, "计算机科学与技术", "19990101002");
        Student s3 = new Student();
        s3.name="王五";
        s3.age=22;
        s3.className="计算机科学与技术";
        s3.stuId="19990101003";
        s1.sayHi();
        s2.study();
        s3.play("赵六");
    }
}
