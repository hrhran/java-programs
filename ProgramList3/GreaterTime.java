import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class GreaterTime {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time hh:mm");
        String date=sc.nextLine();
        SimpleDateFormat f = new SimpleDateFormat("HH:mm");
        Date d = new Date();
        System.out.println(f.format(d));
        if(f.parse(f.format(d)).after(f.parse(date)))
            System.out.println("Input time is lesser than current time");
        else
            System.out.println("Input time is greater than current time");
    }
}
