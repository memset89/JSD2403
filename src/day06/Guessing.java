package day06;

import java.util.Random;
import java.util.Scanner;

/**需求：猜数字小游戏
 * 训练目标：while（true）
 *
 */
public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int range=1000;
        int num=random.nextInt(range)+1;

        System.out.println(num);
        System.out.printf("你猜(%d以内)\n",range);
        while (true){
            int guess = scanner.nextInt();
            if (guess==num){
                System.out.println("猜对了");
                break;
            }else if (guess<num){
                System.out.println("猜小了");
            }else {
                System.out.println("猜大了");
            }
        }
    }

}
