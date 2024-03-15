package exam0315;

public class arrayMax {
    public static void main(String[] args)
    {
        int arr[]={10,9,1,20,19,30,5};
        int sub=0,max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                sub=i;
            }
        }
        System.out.println("最大值为："+max+"，最大值的下标为："+sub);
    }
}
