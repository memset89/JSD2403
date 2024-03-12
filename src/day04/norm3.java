package day04;

import java.util.Random;
import java.util.Scanner;

public class norm3 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        Random y=new Random();
        int n=y.nextInt(100);
        int m;

        do {
            System.out.println("输入");
            m=x.nextInt();
            if (m>n){
                System.out.println("big");
            }else if (m<n){
                System.out.println("small");
            }
        }while (m!=n);
        System.out.println("right");


    }
}
