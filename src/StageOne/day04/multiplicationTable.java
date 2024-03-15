package StageOne.day04;

public class multiplicationTable {
    public static void main(String[] args) {
        int x=1,y=1;
        for (x=1;x<=9;x++){
            for (y=x;y<=9;y++){
                System.out.printf(x+" * "+y+" = "+x*y+" | ");
            }
            System.out.println();

        }
    }
}
