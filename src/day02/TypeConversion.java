package day02;

public class TypeConversion {
    public static void main(String[] args) {
        /*
        * 自动类型转换/隐式类型转换  从小类型到大类型
        * 强制类型转换  从大类型到小类型
        * byte<short<(int=char)<long<float<double
        *  1B    2B      4B      8B    4B    8B
        * */
        int a=5;
        long b=a;//int->long  小到大自动转
        //int c=b;//long->int 从大到小  不能自动转  必须强转
        int c=(int)b;//long->int 从大到小  不能自动转  必须强转  cast type
        long d=5;//auto type conversion
        double x=5;//auto conversion
        System.out.println(x);
        double h=25.123;
        int i=(int)h;//小数转整数 直接一刀切
        //强转有可能丢失精度
        long l=123;
        float k=l;//long->float auto
        System.out.println(k);
        float s;
        s=0.1F;
        long j=(long)s;//float转long需要强制转换
        System.out.println(j);

    }
}
