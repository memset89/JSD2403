package homeWork;

import StageTwo.day07ooday01.CarClass;

public class Cartest {
    public static void main(String[] args) {
        Car car1=new Car("BMW", 100000, "red");
        Car car2=new Car("Benz", 200000, "blue");
        Car car3=new Car();
        car3.brand="Toyota";
        car3.price=300000;
        car3.color="black";
        car1.run();
        car2.start();
        car3.stop();
    }
}
