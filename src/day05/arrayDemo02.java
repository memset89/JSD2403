package day05;

public class arrayDemo02 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 1; i < 10; i++){
            arr[i] = i;
        }
        int[] arr2 =new int[9];
        System.arraycopy(arr,1,arr2,0,9);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
