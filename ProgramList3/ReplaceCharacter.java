import java.util.Scanner;
public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        System.out.println("Enter character to be replaced");
        char c = sc.next().charAt(0);
        System.out.println("Enter replacement character");
        char r = sc.next().charAt(0);
        String output = s.replace(c,r);
        System.out.println("New string is " + output);
    }
}
