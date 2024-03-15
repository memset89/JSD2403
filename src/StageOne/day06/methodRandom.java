package StageOne.day06;

import java.util.Random;

/**
 * 这个类提供了一个静态方法来生成包含随机整数的数组。
 */
public class methodRandom {
    public static void main(String[] args) {
        // 调用 random 方法生成一个包含 10 个随机整数的数组
        int[] arrauto = random();
        // 遍历并打印数组中的所有元素
        for (int i = 0; i < arrauto.length; i++) {
            System.out.println(arrauto[i]);
        }
    }

    /**
     * 生成一个包含 10 个 0 到 99 之间随机整数的数组。
     *
     * @return 返回一个长度为 10 的整数数组，数组中的每个元素都是随机生成的整数，范围在 0 到 99 之间（包括 0 和 99）。
     */
    public static int[] random() {
        // 创建一个 Random 对象用于生成随机数
        Random random = new Random();
        int[] arr = new int[10]; // 创建一个长度为 10 的整数数组
        // 循环为数组的每个元素赋一个随机值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // 为数组的当前元素生成一个 0 到 99 之间的随机整数
        }
        return arr; // 返回生成的包含随机整数的数组
    }
}
