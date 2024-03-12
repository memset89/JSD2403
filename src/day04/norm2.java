package day04;

import java.util.Random;
import java.util.Scanner;

public class norm2 {
    public static void main(String[] args) {
        Random x=new Random();
        int n=x.nextInt(100);
        System.out.println("100以内的值");
        Scanner s=new Scanner(System.in);
        int y=s.nextInt();
        while (y!=n){
            if (y>n){
                System.out.println("big");
            }else {
                System.out.println("small");
            }
        }
        System.out.println("right");
    }
}
