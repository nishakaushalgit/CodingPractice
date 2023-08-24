public class Leader {
    static void leader(int arr[], int n){
        int curr_leader= arr[n-1];
        System.out.print(curr_leader+ " ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>curr_leader){
                curr_leader= arr[i];
                System.out.print(curr_leader+ " ");
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={7,10,4,10,6,5,2};
        int n=7;
        leader(arr, n);
    }
}
