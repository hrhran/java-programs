import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int f=-1,s=1,n,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            t=f+s;
            System.out.print(t+" ");
            f=s;
            s=t;
        }
    }
}
