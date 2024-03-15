package StageOne.day05;

import java.util.Random;

public class arrDemo02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random x = new Random();
        System.out.println(arr.length);
        System.out.println(arr[0]);
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[arr.length - 1]);
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = x.nextInt(20);
            System.out.println(arr1[i]);
        }

    }
}

