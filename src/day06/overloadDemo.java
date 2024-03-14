package day06;

public class overloadDemo {
    public static void main(String[] args) {
        say();
        say(20);
        say("张三");
    }

    public static void say(String args) {
        System.out.printf("大家好，我叫%s",args);
    }
    //重载
    public static void say(int age) {
        System.out.println("大家好，我"+age+"岁了");
    }
    public static void say() {
        System.out.println("大家好");
    }

    /**
     * public static int say() {
     *         return 1;
     *     }
     * 重载和返回值类型无关  与参数类型有关
     * public static void say(int ageggg) {
     * }
     *重载和参数名称无关
     * @return
     */


}
