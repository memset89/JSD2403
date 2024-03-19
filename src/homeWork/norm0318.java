package homeWork;

abstract public class norm0318  {
    String name;
    int age;
    String color;
    norm0318(){

    }
    norm0318(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    abstract void eat();
    void drink(){
        System.out.println("正在喝水");
    }
}
