package day04;

//输出1900到2023年之间所有的闰年(每够10个年份，换一行输出1900到2023年之间所有的闰年(每够10个年份，换一行
public class expand3 {
    public static void main(String[] args) {
        int y = 0;
        for (int x = 1900; x <= 2023; x++) {
            if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0) {
                System.out.print(x + "  ");
                if (++y % 10 == 0) {
                    System.out.println("");
                }
            }
        }
    }
}
