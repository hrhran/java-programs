import java.util.Scanner;
class OverrideClass{
    String s;
    OverrideClass(String str){
        s=str;
    }
    public String toString() {
        return s+"Overridden";
    }
}
class OverrideToString{
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        OverrideClass o=new OverrideClass(str);
        System.out.println(o);
    }
}
