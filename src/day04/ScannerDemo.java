package day04;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner ad=new Scanner(System.in);
        int agee= ad.nextInt();
        System.out.println(agee);
        int num=ad.nextInt();
        switch (num){



            case 1:
                System.out.println("111");
                break;
            case 2:
                System.out.println("222");
                break;
            case 3:
                System.out.println("333");
                break;
            default:
                System.out.println("sss");
        }
    }
}
