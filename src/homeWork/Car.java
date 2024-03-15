package homeWork;
/**
 *Car类和CarTest类：
 *
 * Car类：brand(品牌)，color，price，构造方法()，start()、run()、stop()
 *
 * CarTest类：创建对象，访问测试
 */
public class Car {
    String brand;
    String color;
    int price;
    Car(){

    }
    Car(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    void start(){
        System.out.println(detail()+"启动汽车");
    }
    void run(){
        System.out.println(detail()+"汽车正在行驶");
    }
    void stop(){
        System.out.println(detail()+"汽车停止行驶");
    }
    String detail(){
        return "汽车品牌：" + brand + "，汽车价格：" + price + "，汽车颜色：" + color+"汽车状态：";
    }
}
