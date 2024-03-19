package StageTwo.day09ooday03;
/** Animal家族的测试类 */
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("小黑",2,"黑");
        dog.eat();       //调用Dog类重写之后的
        dog.drink();     //调用Animal类的
        dog.lookHome();  //调用Dog类的

        Chick chick = new Chick("小花",1,"花");
        chick.eat();     //调用Chick类重写之后的
        chick.drink();   //调用Animal类的
        chick.layEggs(); //调用Chick类的

        Fish fish = new Fish("小金",2,"金");
        fish.eat();   //调用Fish类重写之后的
        fish.drink(); //调用Animal类的
    }
}












