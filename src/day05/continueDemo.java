package day05;

public class continueDemo {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        /*for (;x<=9;x++){
            for (y=x;y<=9;y++){
                System.out.printf(x+" * "+y+" = ");
                System.out.printf("%2d",x*y);
                System.out.printf(" | ");
            }
            System.out.println("");
        }*/
        for (; x <= 9; x++) {
            for (y = 1; y <= x; y++) {
                System.out.printf(x + " * " + y + " = " + x * y + "\t");
                //System.out.printf("%2d",x*y);
                //System.out.printf(" | ");
            }
            System.out.println("");
        }


    }
}
