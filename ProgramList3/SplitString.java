import java.util.Scanner;
public class SplitString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}

