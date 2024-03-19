package homeWork;

public class dogx extends norm0318 implements swim{
    dogx(){}
    dogx(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public void eat(){System.out.println(color+"小狗"+name+"今年"+age+"岁，正在吃骨头");}
    public void swim(){
        System.out.println(age+"岁的"+color+"小狗"+name+"正在游泳");
    }
    void drink(){
        System.out.println(age+"岁的"+color+"小狗"+name);
        super.drink();

    }
}
