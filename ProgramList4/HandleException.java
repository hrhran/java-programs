public class HandleException {
    public static void main(String args[]){
        try{
            int val=1/0;
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Handled by Exception");
    }
}
