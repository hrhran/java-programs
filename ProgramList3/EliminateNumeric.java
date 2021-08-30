import java.util.Scanner;
public class EliminateNumeric {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        s=s.replaceAll("\\d","");
        System.out.println("New string is "+s);

    }
}
