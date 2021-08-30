class VariableScope {
    int a=5;         //Accessed by objects
    int b=10;
    public void method1(int x)
    {
        int c=15;         //Throughout the function
        System.out.println(a+c);
        System.out.println(x+10);
    }
    public static void main(String args[])
    {
        int d=20;       //Throughout the function
        VariableScope v=new VariableScope();
        for(int i=0;i<2;i++){
            int temp=i;        //i, temp only for the loop
        }
        v.method1(5);
    }
}
