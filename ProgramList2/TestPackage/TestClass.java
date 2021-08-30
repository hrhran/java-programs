package TestPackage;

public class TestClass {           //Accessed from Anywhere
    public void print() {
        System.out.println("Public!");
    }
    protected void message(){
        System.out.println("Protected");
    }
    void show(){
        System.out.println("Default");
    }
}
