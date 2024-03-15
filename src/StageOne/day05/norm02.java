package StageOne.day05;

import java.util.Arrays;

public class norm02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        int[] arr1= Arrays.copyOf(arr,4);
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        arr= Arrays.copyOf(arr,8);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        int[] arrcopy=new int[20];
        System.arraycopy(arr,0,arrcopy,5,4);
        for (int i = 0; i < arrcopy.length; i++){
            System.out.println(arrcopy[i]);
        }
    }
}
