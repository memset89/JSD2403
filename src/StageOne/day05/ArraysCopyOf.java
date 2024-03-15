package StageOne.day05;

import java.util.Arrays;

public class ArraysCopyOf {
    public static void main(String[] args) {
        //使用Arrays.copyOf()可以复制数组
        int[] a = {1, 2, 3, 4, 5};
        //a ：源数组 b: 目标数组 6: 目标数组的长度(即目标数组的长度)
        int[] b = Arrays.copyOf(a, 6);
        //如果源数组少于需求 则补0 如果多余 那么截取后面多余部分
        //相比于ArrayCopy灵活性较差
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        //应用场景 ：数组扩容
        int[] c = new int[10];
        c = Arrays.copyOf(c, 15);
        for (int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }
}
