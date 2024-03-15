package exam0315;

public class multiTable {
    public static void main(String[] args) {
        for (int x=9;x>=1;x--){
            for (int y=1;y<=x;y++){
                System.out.printf("%d*%d=%d\t",y,x,x*y);
            }
            System.out.println();
        }
    }
}
