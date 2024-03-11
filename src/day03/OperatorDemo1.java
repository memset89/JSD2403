package day03;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //算数运算符  +  -  *  /  %  ++   --
        System.out.println(8%2);//整除
        /*System.out.println(8%0);
        *
        * */
        int x=1;
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        /*System.out.println(x);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);*/
        int y=1,z=1;
        System.out.println(++y);
        System.out.println(z++);
        System.out.println(y);
        System.out.println(z);
        /**前加和后加
         * 1；单独使用时  前加和后加一样
         * 2；被调用时 前加调用+1值  后加调用原本值
         * 即在被其他函数调用时 所调用的值
         * -- 同理
         */
        System.out.println("xxxxxxxxxxxxxx");
        int a;
        for (a=1;a<=10;a++){
            System.out.println(a);
        }
        System.out.println(a);
        char g='x';
        System.out.println(g);
        a=10;int b=10;int c=10;
        System.out.println(a+b>c);
        System.out.println(a++>=10);
        System.out.println(++a==12);
    }
}
/**
 *
 */
