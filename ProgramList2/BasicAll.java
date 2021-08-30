public class BasicAll {
    int a=5;
    public static void main(String[] args) {
        int n=10;
        float f=3.14f;
        char c='A';
        boolean b=true;
        String s="Hari";
        int arr[]={1,2,3};
        String[] strarr = {"Bangalore", "Madurai", "Chennai"};
        System.out.println(n+" "+f+" "+c+" "+b+" "+s);
        for(int i=0;i<3;i++)
            System.out.println(arr[i]+" "+strarr[i]);
        BasicAll basic=new BasicAll();
        System.out.println(basic.a);
    }
}
