public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Test";
        String s2 = new String("Test");
        System.out.println(" Equals - Compares the actual string value");
        System.out.println(s1.equals(s2));
        System.out.println(" == - Compares the address");
        System.out.println(s1==s2);
    }
}
