public class FibonacciSeries {
    static int n1=0; 
    static int n2=1; 
    static int n3;
    static void fibonacciSeries(int count){
        //with recurssion
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+ n3);
        }
        else{
            return;
        }
        fibonacciSeries(count-1);
    }
        
        //without recurrsion
    //     int n1=0; int n2=1; int n3;
    //     System.out.print(n1+ " "+ n2);
    //     for(int i=2;i<count;i++){
    //         n3=n1+n2;
    //         System.out.print(" "+ n3);
    //         n1=n2;
    //         n2=n3;
    //     }
    // }
    // public static void main(String[] args) {
    //     int count=10;
    //     fibonacciSeries(count);
    // }
    public static void main(String[] args) {
        int count=20;
        System.out.print(n1+" "+n2);
        fibonacciSeries(count-2);
    }
}
