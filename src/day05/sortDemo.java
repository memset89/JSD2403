package day05;

import java.util.Arrays;
import java.util.Random;

public class sortDemo {
    public static void main(String[] args) {
        //int[100]
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int[] ax=new int[100];
        Random random=new Random();
        for (int i = 0; i < ax.length; i++){
            ax[i]=random.nextInt(100);
        }
        Arrays.sort(ax);
        for (int i = 0; i < ax.length; i++)
        {
            System.out.println(ax[i]+"ss");
        }


    }
}
