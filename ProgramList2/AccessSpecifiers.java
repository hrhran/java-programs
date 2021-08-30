import TestPackage.TestClass;
class AccessSpecifiers extends TestClass {
    private AccessSpecifiers() {
        System.out.println("Private constructor");
        //Cannot instantiate with a subclass
    }

    public static void main(String[] args){
        TestClass ex = new TestClass();
        AccessSpecifiers a=new AccessSpecifiers();  // Private Constructor
        ex.print();
        a.message();      //Accessed through child - Protected

    }
}
