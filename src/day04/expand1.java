package day04;

import java.util.Scanner;

public class expand1 {
    public static void main(String[] args) {
        Scanner x1 = new Scanner(System.in);
        int num = x1.nextInt();
        if (num == 0) {
            System.out.println(num);
        } else if (num > 0) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}
