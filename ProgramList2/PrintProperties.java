public class PrintProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println("Current Directory is " + System.getProperty("user.dir"));
    }
}
