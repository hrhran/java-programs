import java.util.Scanner;
import java.util.StringTokenizer;
class Tokenizer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        StringTokenizer t = new StringTokenizer(s," ");
        while (t.hasMoreTokens()) {
            System.out.println(t.nextToken());
        }
    }
}