package StageTwo.day10ooday04;

public class MultiTypeDemo {
    public static void main(String[] args) {
        /*//演示向上造型
        Dog o1 = new Dog("Tom", 2, "yellow");
        Animal o2=new Dog("Tom", 2, "yellow");
        Swim o3=new Dog("Tom", 2, "yellow");
        o1.swim();*/
        //演示向上造型（多态）的第一点应用
        Master master=new Master();
        Animal dog=new Dog("Tom",2,"yellow");
        Animal chick=new Chick("xom",2,"yellow");
        Animal fish=new Fish("fom",2,"yellow");
        master.feed(dog);//在传参的时候，系统自动做了向上造型
        master.feed(chick);
        master.feed(fish);
    }
}
