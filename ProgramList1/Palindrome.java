import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        int flag=1,i=0,j=s.length()-1;
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j))
                flag=0;
            i++;
            j--;
        }
        if(flag==0)
            System.out.println("Not a Palindrome");
        else
            System.out.println("Palindrome");

    }
}
