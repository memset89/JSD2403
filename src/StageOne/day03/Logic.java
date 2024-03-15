package StageOne.day03;

import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {
        /**
         * &&  与
         * */
         double attendanceRate =0.85;
         int score=70;
         if (score>=60&&attendanceRate>=0.80){
             System.out.println("passd");
         }
         else {
             System.out.println("fail");
         }
         /**
          * || 或
          * */
         int money=100,wx=200;
         if (money>=150||wx>=150)
             System.out.println("enough");
         else
             System.out.println("not enough");


         /**
          * ! 非
          * */
         int age=22;
         if (!(age>=25))
             System.out.println("ok");
         else
             System.out.println("no");

         //
        System.out.println("请输入你的名字：");
        Scanner name=new Scanner(System.in);
        String myName= name.next();
        System.out.println(myName);




    }
}
