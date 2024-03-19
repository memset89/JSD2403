package StageTwo.day09ooday03;
/** 动物类 */
public class Animal {
    String name;
    int age;
    String color;
    Animal(){
    }
    Animal(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void drink(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在喝水...");
    }
    void eat(){ //下次课继续处理
        System.out.println(color+"色的"+age+"岁的"+name+"正在吃饭...");
    }
}












