public class TrappingRainWater {
    static int trapping(int arr[], int n){
        int res=0;
        int lmax[]= new int[n];
        int rmax[]= new int[n];
        
        for(int i=1; i<n;i++){
            lmax[0]=arr[0];
            lmax[i]=Math.max(arr[i], lmax[i-1]);
        }
        for(int i=n-2; i>=0;i--){
            rmax[n-1]=arr[n-1];
            rmax[i]=Math.max(arr[i], rmax[i+1]);
        }
        for(int i=1;i<n; i++){
        res= res+Math.min(lmax[i],rmax[i])-arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={5, 0, 6, 2, 3}; int n = 5;
        System.out.println(trapping(arr, n));
    }
}
