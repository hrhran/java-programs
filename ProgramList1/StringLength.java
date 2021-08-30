import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        int len=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.next();
        for (char c : s.toCharArray())
            len++;
        System.out.println("Length of string is "+len);
    }
}
