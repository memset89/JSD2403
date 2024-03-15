package StageOne.day03;

import java.util.Scanner;

public class expand {
    public static void main(String[] args) {
        //1
        int a=10,b=20;
        int max=a>b?a:b;
        System.out.println(max);
        //2
        Scanner y=new Scanner(System.in);
        System.out.println("输入年份：");
        int year=y.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
        //3
        System.out.println("请输入成绩");
        int score=y.nextInt();
        if (score>100||score<0){
            System.out.println("成绩不合法");
        }else{
            if (score>=90){
                System.out.println("A");
            }else if (score>=80){
                System.out.println("B");
            }else if (score>=60){
                System.out.println("C");
            }else{
                System.out.println("D");
            }
        }


    }
}
