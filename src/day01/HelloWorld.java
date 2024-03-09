package day01;//

import java.util.Arrays;


class FreshJuice{
    enum FreshJuiceSize{SMALL ,NEDIUM,LARGE}
    FreshJuiceSize size;
}
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(1231332);
        System.out.println("1sa2x156a");
        System.out.println("12\n" + "12" + "12\n");
        FreshJuice juice=new FreshJuice();
        juice.size=FreshJuice.FreshJuiceSize.SMALL;
        System.out.println(juice.size);
        System.out.println(123123);
        System.out.println(1);
        System.out.println("HelloWorld.main");
    }
}
//单行注释

/*
 多行注释
 */

/**
 *
 文档注释
 *
 */