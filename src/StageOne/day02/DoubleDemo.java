package StageOne.day02;

public class DoubleDemo {
    public static void main(String[] args) {
        double a=3.14;//8个字节  小数直接量默认double
        float b=3.14F;
        double c=3.0,d=2.9;
        System.out.println(c/d);
        c=3.0;
        d=1.5;
        System.out.println(c/d);
        c=10.0;d=9.0;
        System.out.println(c/d);
    }
}
