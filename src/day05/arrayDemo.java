package day05;

public class arrayDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] c=new int[5];
        boolean[] x=new boolean[2];
        x[0]=true;
        x[1]=false;
        if (x[0]){
            System.out.println("是");
        }else {
            System.out.println("否");
        }

        /**初始化数组方法
         * int[] arr=new  int[3];
         * int[] arr={2,5,6};
         * int[] arr=new  int[]{2,5,8};
         * int[] arr;
         * arr=new int{2,5,8};
         */
        int[] age;
        age=new int[]{1};
        System.out.println(age.length);
        //System.out.printf("%d  %d",age[0],age[1]);






    }


}
