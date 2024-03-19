package homeWork;

public class fishx extends norm0318 implements swim{
    fishx(){}
    fishx(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public void eat(){System.out.println(color+"小鱼"+name+"今年"+age+"岁，正在吃虾米");}
    public void swim(){
        System.out.println(age+"岁的"+color+"小鱼"+name+"正在游泳");
    }
    void drink(){
        System.out.println(age+"岁的"+color+"小鱼"+name);
        super.drink();

    }
}
