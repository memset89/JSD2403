package StageTwo.day09ooday03;
/** 小狗类 */
public class Dog extends Animal {
    Dog(){
    }
    Dog(String name, int age, String color){
        super(name,age,color);
    }

    void lookHome(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在看家...");
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在吃骨头...");
    }
}













