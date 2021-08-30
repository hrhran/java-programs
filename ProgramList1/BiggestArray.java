import java.util.Scanner;
public class BiggestArray {
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
        int max=arr[0];
        for(int i=0;i<n;i++)
            if(max<arr[i])
                max=arr[i];
        System.out.println("Biggest number in array is "+max );
    }
}
