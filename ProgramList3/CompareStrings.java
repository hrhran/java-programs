
import java.util.Scanner;
public class CompareStrings {
    static void ignoreCase(String s1,String s2){
        if((s1.toLowerCase()).equals((s2.toLowerCase())))
            System.out.println("Same String (Ignoring Case)");
        else
            System.out.println("Different String (Ignoring Case)");
    }
    static void considerCase(String s1,String s2){
        if(s1.equals(s2))
            System.out.println("Same String (Without Ignoring Case)");
        else
            System.out.println("Different String (Without Ignoring Case)");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1=sc.nextLine();
        System.out.println("Enter string 2");
        String s2=sc.nextLine();
        ignoreCase(s1,s2);
        considerCase(s1,s2);

    }

}
