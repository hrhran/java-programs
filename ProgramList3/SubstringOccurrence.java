import java.util.Scanner;
public class SubstringOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        System.out.println("Enter substring");
        String sub=sc.nextLine();
        int c=(s.split(sub,-1).length)-1;
        System.out.println("No of Occurrence is " +c);
    }
}

