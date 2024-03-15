package StageOne.day05;

public class expand03 {
    public static void main(String[] args) {
        for (int i =1;i<=11;i+=2){
            int y=i;
            while (--y>=0){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
