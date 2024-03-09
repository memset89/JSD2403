package day02;

public class name {
    public static void main(String[] args) {
        char abHa = 'a';
        System.out.println(abHa);
        //int占4个字节 21 4748 3647
        //整数除法无条件保留整数 舍弃小数位
        int a;
        a=2147483647;
        a+=1;
        System.out.println(a);

        a-=100;
        System.out.println(a);
        a+=200;
        System.out.println(a);
    }
}
