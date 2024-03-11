package day03;

public class shortOut {
    public static void main(String[] args) {
        int a=5,b=10,c=5;
        boolean b3=a>b&& c++>2;//短路与   第一个条件如果已经为否  则后面条件不再执行
        System.out.println(b3);
        System.out.println(c);
        /**
         * 或 |  如果第一条件满足 第二条件也会短路
         * */
    }
}
