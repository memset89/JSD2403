package StageOne.day06;
//方法的演示
//方法体
class De{
    public static void ya()
    {
        //方法的调用
        //方法的调用方式
        //1.对象.方法名(参数列表)
        //2.类名.方法名(参数列表)
        //3.类名.静态方法名(参数列表)
        //4.对象.静态方法名(参数列表)
        //5.静态方法名(参数列表)
        //方法的调用顺序
        //1.先调用静态方法
        //2.再调用普通方法
        //3.最后调用非静态方法
        //方法的重载
        //1.方法名相同
        //2.参数列表不同
        //3.参数列表的个数不同
        //4.参数列表的顺序不同
        //5.参数列表的类型不同
        //6.参数列表的个数相同，但是参数列表的顺序不同
        //7.参数列表的个数相同，但是参数列表的类型不同
        //8.参数列表的个数相同，但是参数列表的顺序不同
        //9.参数列表的个数相同，但是参数列表的类型相同，但是参数列表的顺序不同
        System.out.println("方法的重载");
    }
}


public class MethodDemo {
    public static void main(String[] args) {
        De.ya();
        say();
        sayHi("张三");//<-实参
        //调用时传值
        int x=7,y=8;
        System.out.println(m(x,y));
    }
    /**
     * say方法 - 输出欢迎信息
     * 无参数
     * 无返回值
     */
    public static void say(){
        // 输出"Hello"
        System.out.println("Hello");
    }
    public static void sayHi(String name){//<-形参
        System.out.printf("大家好，我叫%s",name);
    }
    public static int m(int x,int y){//<-形参
        return x*y;
    }

}
