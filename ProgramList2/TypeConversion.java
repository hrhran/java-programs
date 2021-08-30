import java.util.Scanner;
public class TypeConversion {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter float value");
       Float a=sc.nextFloat();
       Integer i = a.intValue();
       Double d = a.doubleValue();
       System.out.println("Integer value is "+i );
       System.out.println("Double value is "+d );
    }
}
