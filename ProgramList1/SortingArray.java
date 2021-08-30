import java.util.Scanner;
public class SortingArray {

    static int[] sortArray(int n,int[] arr){
        int t;
        for (int i=0;i<n;i++)
            for (int j=i+1;j<n;j++)
                if(arr[i]>arr[j]) {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
        return arr;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        arr=sortArray(n,arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
