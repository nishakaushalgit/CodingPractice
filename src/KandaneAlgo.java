public class KandaneAlgo {
    static int maxSubarraySum(int arr[], int n){
        int res=arr[0];
        int maxending =arr[0];
        for(int i=1; i<n;i++){
            maxending= Math.max((maxending+arr[i]), arr[i]);
            res= Math.max(res, maxending);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,-1,5,6};
        int n=6;
        System.out.println(maxSubarraySum(arr, n));
    }
}
