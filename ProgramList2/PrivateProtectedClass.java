class Demo{
    private class PrivateClass {
        public void print() {
            System.out.println("Private class");
        }
    }
    protected class ProtectedClass {
        public void print() {
            System.out.println("Protected class");
        }
    }
    void display() {
        PrivateClass pri=new PrivateClass();
        ProtectedClass pro=new ProtectedClass();
        pri.print();
        pro.print();
        }
}
    class PrivateProtectedClass {
        public static void main(String args[]) {
            System.out.println("Private/Protected Class can't be on top level.");
            Demo run = new Demo();
            run.display();
        }
    }
