import java.util.Scanner;
public class EliminateSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        System.out.println("Enter substring");
        String sub = sc.nextLine();
        String output = s.replace(sub, "");
        System.out.println("New string is " + output);
    }
}
