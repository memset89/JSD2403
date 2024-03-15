package StageOne.day05;

import java.util.Arrays;

public class norm03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = arr[0];
        for (int i = 1; i <arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        arr=Arrays.copyOf(arr, arr.length+1);
        arr[arr.length-1]=max;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
