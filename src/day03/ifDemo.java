package day03;
class pok{
    enum pokmen{small,mid,big}
    pokmen size;
}

public class ifDemo {
    public static void main(String[] args) {
        double price1=618,price2=412;
        if (price1>=500)    price1*=0.8;
        if (price2>=500)    price2*=0.8;
        System.out.println(price1);
        System.out.println(price2);
        pok pika =new pok();
        pika.size= pok.pokmen.small;

    }
}
