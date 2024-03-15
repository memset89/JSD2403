package StageOne.day05;

import java.util.Arrays;

public class norm04 {
    public static void main(String[] args) {
        int[] arr = new int[100] ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + " \n");
        }
    }
}
