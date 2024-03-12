package day04;

import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        Random c=new Random();

        int num=c.nextInt(1000);
        System.out.println(num);
        int n;
        do {
            System.out.println("please guess");
            n=p.nextInt();
            if (n>num){
                System.out.println("big");
            }
            else if (n<num){
                System.out.println("small");
            }
        }while (n!=num);
        System.out.println("right");
    }
}