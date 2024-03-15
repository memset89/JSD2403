package StageTwo.day07ooday01;
//汽车类
//成员变量：品牌brand，价格price，颜色color，速度speed   构造方法：Car（），Car（3参数）  方法：run()，stop()，start()
//？？？牌子的  ？？？颜色的？？？块钱的车？？？
public class CarClass {
            String brand;
            int price;
            String color;
            //int speed;
        CarClass(){
        }
        CarClass(String brand, int price, String color) {
           this.brand = brand;
           this.price = price;
           this.color = color;
           //this.speed = speed;
        }
        void run() {
            System.out.println(detail()+"汽车运行了");
        }
        void stop() {
            System.out.println(detail()+"汽车停止了");
        }
        void start() {
            System.out.println(detail()+"汽车启动了");
        }
        String detail() {
            return brand+" 牌" +color +"颜色"+price+ "块钱的" ;
        }
    }


