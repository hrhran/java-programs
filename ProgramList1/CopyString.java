import java.util.Scanner;
public class CopyString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1 = sc.nextLine();
        String s2 = new String(s1);
        System.out.println("String 2 is "+s2);
    }
}
