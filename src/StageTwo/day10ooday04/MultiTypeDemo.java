package StageTwo.day10ooday04;

public class MultiTypeDemo {
    public static void main(String[] args) {
        /*//演示向上造型
        Dog o1 = new Dog("Tom", 2, "yellow");
        Animal o2=new Dog("Tom", 2, "yellow");
        Swim o3=new Dog("Tom", 2, "yellow");
        o1.swim();*/
        //演示向上造型（多态）的第一点应用
        /*Master master=new Master();
        Animal dog=new Dog("Tom",2,"yellow");
        Animal chick=new Chick("xom",2,"yellow");
        Animal fish=new Fish("fom",2,"yellow");
        master.feed(dog);//在传参的时候，系统自动做了向上造型
        master.feed(chick);
        master.feed(fish);*/
        //演示向上造型的第二点应用
        //animal不能new
        //但是可以new数组
        /*Animal[] animals=new Animal[5];
        animals[0]=new Dog("wom",2,"write");
        animals[1]=new Chick("bom",2,"blue");
        animals[2]=new Fish("yom",2,"yellow");
        animals[3]=new Dog("tom",2,"black");
        animals[4]=new Chick("dom",2,"red");
        for (int i=0;i<animals.length;i++){
            System.out.println(animals[i].name);
            animals[i].drink();
            animals[i].eat();
        }
        */
        Animal o=new Dog("Tom",2,"yellow");
        Dog g=(Dog)o;
        Swim s=(Swim)o;
        s.swim();
        //Fish x=(Fish)o;
        if (o instanceof Fish){
            Fish f=(Fish) o;
        }
        else {
            System.out.println("o不是Fish的类型");
        }

    }
}
