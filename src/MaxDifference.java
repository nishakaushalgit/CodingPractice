public class MaxDifference {
    static int maxDifference(int arr[], int n){
        int res= arr[1]-arr[0];
        int min_value= arr[0];
        for(int i=1; i<n; i++){
            res=Math.max((arr[i]-min_value),res);
            min_value=Math.min(arr[i], min_value);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2, 3, 10, 6, 4, 8, 1};
        int n= 7;
        System.out.println(maxDifference(arr, n));
    }
}
