package StageOne.day02;

public class CharDemo {
    public static void main(String[] args) {
        char a='1';
        char b='女';//Unicode  世界通用字符集 一个字符对应一个码  a 97  A  65   0  48
        //  0-65535
        System.out.println(b);
        char g=97;
        System.out.println(g);
        g=0;
        System.out.println(g);
        g=65535;
        System.out.println(g);
        g=34521;
        System.out.println(g);
        g='\\';
        System.out.println(g);
    }
}
