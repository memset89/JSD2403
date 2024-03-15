package StageOne.day05;

public class expand04 {
    public static void main(String[] args) {
        // 定义数组，包含10个元素，随机生成数据(范围自拟)，查找最大值和最小值，并输出
        int[] arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
        }
        int max=arr[0],min=arr[0];
        for (int i=1;i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }else if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.printf("最大值是%d  最小值是%d\n",max,min);
    }
}
