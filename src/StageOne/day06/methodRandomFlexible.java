package StageOne.day06;

import java.util.Random;

public class methodRandomFlexible {
    public static void main(String[] args) {
        int[] arr = random(20,1000);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        int[] arrt = randomTwo(20,500,555);
        for (int i = 0; i < arrt.length; i++) {
            System.out.print(arrt[i]+"\t");
        }
        String name="kobi";
        int age=8;
        s(name,age);
        a();

    }

    public static int[] random (int len,int max) {
        int[] arr = new int[len];
        Random r = new Random();
        for (int i = 0; i <len; i++) {
            arr[i] = r.nextInt(max+1);
        }
        return arr;
    }
    public static int[] randomTwo (int len,int min,int max) {
        int[] arr = new int[len];
        Random r = new Random();
        for (int i = 0; i <len; i++) {
            arr[i] = r.nextInt(max-min+1)+min;
        }
        return arr;
    }
    public static void s(String name,int age){
        if (age>60){
            return;
        }
        System.out.printf("大家好，我的名字是%s，今年%d岁了",name,age);
    }
    //写一个判断某年某月有多少天的方法
    public static int getDay(int year,int month){
        int day=0;
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            day=31;
        }else if (month==4||month==6||month==9||month==11){
            day=30;
        }else if (month==2){
            if (year%4==0&&year%100!=0||year%400==0){
                day=29;
            }else {
                day=28;
            }
        }
        return day;
    }
    public static void a(){
        System.out.println("111");
        b();
        System.out.println("333");
    }
    public static void b(){
        System.out.println("222");
    }
}
//方法的重载
//定义：发生在同一类中，方法名相同，但参数列表不同
//绑定：编译器根据签名（参数列表）来确定调用哪个重载方法
