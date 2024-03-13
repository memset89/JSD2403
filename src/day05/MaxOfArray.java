package day05;

public class MaxOfArray {
    public static void main(String[] args) {
        //找出数组中最大值  数组大小20个 用Random生成100以内的随机数
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        //现在找出最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值是：" + max);
        /*
        1.遍历数组
        2.用一个变量max来保存最大值
        3.在循环中，判断当前元素是否大于max，如果是则更新max的值
         */





    }
}
