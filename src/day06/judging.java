package day06;
//评委打分程序

import java.util.Arrays;
import java.util.Scanner;

/**
 * 主持人大赛  你位评委打分
 * 选手的最终得分为 去掉最高分和最低分后的N-2名评委的平均分
 */
public class judging {
    double max, min;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入评委数量");
        int n = scanner.nextInt();
        double arr[] = reception(n);
        Arrays.sort(arr);
        System.out.printf("去掉一个最高分%.2f，再去掉一个最低分%.2f，最终的平均成绩是 %.2f 分\n", arr[0], arr[arr.length - 1], countAverageScore(arr));
    }


    public static double[] reception(int len) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[len];
        for (int i = 0; i < len; i++) {
            System.out.print("请输入第" + (i + 1) + "名评委的打分: ");
            arr[i] = scanner.nextDouble();/*arr[i]=scanner.nextDouble(); 这一行代码不会直接引起换行。它的功能是从控制台接收用户输入的下一个double类型的数值，并将其赋值给数组 arr 的第 i 个元素。换行与否取决于用户的输入行为，用户在输入分数后通常会按下回车键提交输入，这个回车键会导致控制台显示新的一行，但这并非由该代码行直接引起的。
             */
        }
        return arr;
    }
    public static double countAverageScore(double[] arr) {
        double sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum / (arr.length - 2);
    }

}
