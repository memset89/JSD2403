package day04;

import java.util.Scanner;

public class norm {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        switch (a){
            case 1:
                System.out.println("a");
            case 2:
                System.out.println("b");
            default:
                System.out.println("other");
        }
    }
}
