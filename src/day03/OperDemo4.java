package day03;

public class OperDemo4 {
    public static void main(String[] args) {
        //赋值运算符：=  *=  +=  /=  -=  %=
        int a=5;
        a+=10;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        //自带强转
        short s=5;
        s=(short) (s+10);
        s+=10;
        System.out.println(s);
    }
}
