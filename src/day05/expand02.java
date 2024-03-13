package day05;

public class expand02 {
    public static void main(String[] args) {
        // 利用for循环计算：求8的阶乘，并输出
        int i = 1;
        for (int p = 2; p <= 8; p++) {
            i*=p;
        }
        System.out.print(i + "!");
    }
}
