package StageOne.day06;
class AD{
    public static void  Random10() {
        int[] a= new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] =(int)(Math.random()*100);
            System.out.println(a[i]);
        }
        //return a;
    }
}
public class ArrayDemoNew {
    public static void main(String[] args) {
        /*int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int)(Math.random()*100);
            System.out.println(arr[i]);
        }*/
       AD.Random10();
    }
}
