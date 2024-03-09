package day02;

public class longDemo {
    public static void main(String[] args) {
        //运算时若有可能溢出，建议在第一个数字后加L
        //long e=10000000000*2*10L;
        long e=10000000000L*2*10;
        //long f=1000000000*8*10L;
        long g=1000000000L*8*10;
        System.out.println(e);
        //System.out.println(f);
        System.out.println(g);

    }
}
