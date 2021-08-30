import java.util.Scanner;
public class SortStringArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        String[] arr=new String[30];
        System.out.println("Enter elements");
        for(int i=0;i<=n;i++)
            arr[i]=sc.nextLine();
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(arr[i].compareTo(arr[j])>0)
                {
                    String t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
        for(int i=0;i<=n;i++)
            System.out.print(arr[i]+" ");
    }
}
