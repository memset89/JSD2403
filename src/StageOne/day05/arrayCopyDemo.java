package StageOne.day05;

public class arrayCopyDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.printf("a[%d]=%d", i, arr[i]);
        }
        //arr[0]=0  arr[9]=9

        int[] arr2 = new int[11];
        System.arraycopy(arr, 1, arr2, 0, 9);
        //a:原数组 1：原数组的起始下标 b:目标数组 c:新数组的起始下标 d:要复制的元素个数
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        /*
        a[1]=1
        a[2]=2
        a[3]=3
        a[4]=4
        a[5]=5
        a[6]=6
        a[7]=7
        a[8]=8
         */

    }
}

