package day06;

import java.util.Random;

public class expand2 {
    public static void main(String[] args) {
        int [] arr=new int[100];
        Random random=new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100000)+1;
        }
        printArrayData(arr);
    }
    public static void printArrayData(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
