public class Swap {
    //static void swap(int a, int b){
    static void swap(String a, String b){
        System.out.println("a " + a);
        System.out.println("b " + b);
        a=a+b;//30
        //b=a-b;//10
        //a=a-b;//20
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println("Swapped a is "+ a);
        System.out.println("Swapped b is "+ b);
    }
    public static void main(String[] args) {
        // int a= 10;
        // int b= 200;
        String a= "Nisha";
        String b= "Kaushal";
        swap(a, b);
    }
}
