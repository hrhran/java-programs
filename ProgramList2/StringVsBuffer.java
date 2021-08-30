public class StringVsBuffer {
    public static void main(String[] args) {
        //String Objects are Immutable
        String s1=new String ("Hello");
        s1.concat("World");
        System.out.println(s1);
        //StringBuffer Objects are Mutable
        StringBuffer s2=new StringBuffer("Hello");
        s2.append("World");
        System.out.println(s2);
    }
}
