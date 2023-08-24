public class Factorial {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
        
        //iterative
        // int res=n;
        // while(n>1){
        //     res=res*(n-1);
        //     n--;
        // }
        // return res;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
}
