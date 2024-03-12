package day04;

import java.util.Scanner;

//接收用户输入的年份year和月份month，计算该年该月的天数，并输出
public class expand2 {
    public static void main(String[] args) {
        int mou[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = new Scanner(System.in).nextInt();
        int mouth = new Scanner(System.in).nextInt();
        boolean run;
        run = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        if (run) {
            mou[1]++;
        }
        System.out.println(year + "年" + mouth + "月有" + mou[mouth - 1] + "天");
    }
}
