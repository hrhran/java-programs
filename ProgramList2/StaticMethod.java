public class StaticMethod {
    static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int x=1,y=2;
        System.out.println("Static method doesn't need an object");
        System.out.println(sum(1,2));
    }
}
