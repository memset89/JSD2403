package StageTwo.day08ooday02;
//造子之前先造父
public class extendTest {
    public static void main(String[] args) {
        Student s = new Student( "计算机科学与技术", "19990101001","张三",17,"杭州");
        Teacher t = new Teacher( "计算机科学与技术", "teacher19990101001", "李四" ,28, "绍兴" );
        Doctor d = new Doctor( "主治医师",  "王五" ,48, "杭州");
        s.sayHi();
        s.sleep();
        s.eat();
        s.play("李四");
        s.study();
        t.sleep();
        t.eat();
        t.teach();
        d.sleep();
        d.eat();
        d.sayTitle();
    }
}
