package StageOne.day03;

import java.util.Random;

//条件运算符的演示
public class OperDemo {
    public static void main(String[] args) {
        int num=5;
        int flag=num>0?1:-1;//三元运算符
        System.out.println(flag);
        Random x=new Random();
        for (int i=1;i<=10;i++)
            System.out.println(x.nextInt(1000000000)+1);
       /* do {

        }
        while ()*/
    }
}
