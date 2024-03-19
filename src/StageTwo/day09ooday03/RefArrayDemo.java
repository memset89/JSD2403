package StageTwo.day09ooday03;

import java.util.Scanner;

public class RefArrayDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Dog[] dogs=new Dog[3];
        Chick[] chick=new Chick[5];
        Fish[] fish=new Fish[4];
        dogs[0]=new Dog(scanner.next(),scanner.nextInt(),scanner.next());
        dogs[1]=new Dog("dog2",11,"blue");
        dogs[2]=new Dog("dog3",12,"blue");
        chick[0]=new Chick("chick1",12,"red");
        chick[1]=new Chick("chick2",13,"blue");
        chick[2]=new Chick("chick3",14,"blue");
        chick[3]=new Chick("chick4",15,"blue");
        chick[4]=new Chick("chick5",16,"blue");
        for (int i = 0; i < fish.length; i++){
            fish[i]=new Fish(scanner.next(),scanner.nextInt(),scanner.next());
        }

        fish[1]=new Fish("fish2",15,"blue");
        fish[2]=new Fish("fish3",16,"blue");
        fish[3]=new Fish("fish4",17,"blue");
        for (int i = 0; i < dogs.length; i++){
            dogs[i].eat();
            dogs[i].lookHome();
            dogs[i].drink();
            System.out.println("第"+(i+1)+"只狗的名字是"+dogs[i].name+"他的颜色是"+dogs[i].color+"他的年龄是"+dogs[i].age);
        }
        for (int i = 0; i < chick.length; i++){
            chick[i].eat();
            chick[i].layEggs();
            chick[i].drink();
            System.out.println("第"+(i+1)+"只小鸡的名字是"+chick[i].name+"他的颜色是"+chick[i].color+"他的年龄是"+chick[i].age);
        }
        for (int i = 0; i < fish.length; i++){
            fish[i].eat();
            fish[i].drink();
            System.out.println("第"+(i+1)+"只鱼的名字是"+fish[i].name+"他的颜色是"+fish[i].color+"他的年龄是"+fish[i].age);
        }
    }
}
