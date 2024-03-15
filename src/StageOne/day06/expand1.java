package StageOne.day06;

import java.util.Arrays;
import java.util.Random;

public class expand1 {
    public static void main(String[] args) {
        int [] arr=new int[100];
        Random random=new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100000)+1;
        }
        System.out.println(getMaxOfArray(arr));
    }
    public static int getMaxOfArray(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
