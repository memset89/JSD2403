package StageOne.day04;

public class norm4 {
    public static void main(String[] args) {
        for (int a=1;a<=5;a++){
            System.out.println("阶梯");
        }
        for (int x=1;x<=9;x++){
            for (int y=x;y<=9;y++){
                System.out.printf(x+" * "+y+" = "+x*y+"|");
            }
            System.out.println();
        }
    }
}
