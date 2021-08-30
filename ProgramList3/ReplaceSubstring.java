import java.util.Scanner;
public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        System.out.println("Enter substring");
        String sub = sc.nextLine();
        System.out.println("Enter replacement substring");
        String rep = sc.nextLine();
        if(s.contains(sub)){
            s = s.replace(sub,rep);
            System.out.println("New string is " + s);
        }
        else
            System.out.println("Substring not found");
    }
}
