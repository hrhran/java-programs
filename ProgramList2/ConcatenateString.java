import java.util.Scanner;
public class ConcatenateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1=sc.nextLine();
        System.out.println("Enter string 2");
        String s2=sc.nextLine();
        s1=s1+" "+ s2;
        System.out.println("Concatenated String is "+s1);
    }
}
