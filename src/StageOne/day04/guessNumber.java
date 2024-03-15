package StageOne.day04;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        int n,c,b=0;
        Random f=new Random();
        n=f.nextInt(1000);
        Scanner x=new Scanner(System.in);
        while (true){
            //Math.random()  0.0 ->0.99999999999999999999999
            //
            System.out.println("请输入猜测值：");
            c=x.nextInt();
            b++;
            if (c>n){
                System.out.println("猜大了");
            }else if (c<n){
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了");
                if (b<12){
                    System.out.println("牛蛙 ");
                }else {
                    System.out.println("菜狗");
                }
                System.out.printf("总共猜了"+b+"次");
                break;
                /**
                 * 3.30  44%
                 *
                 */
            }
        }
    }
}
