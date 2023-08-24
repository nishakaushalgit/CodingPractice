public class Sort012 {
static void sort012(int arr[], int n){
    int low=0;
    int mid=0;
    int high=n-1;
    while(mid<=high){
       if(arr[mid]==0){
           int temp=arr[low];
           arr[low]=arr[mid];
           arr[mid]=temp;
           low++;
           mid++;
       }
       else if(arr[mid]==1){
           mid++;
       }
       else{
           int temp=arr[high];
           arr[high]=arr[mid];
           arr[mid]=temp;
           high--;
       }
    }
    int i;
    for(i=0; i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        int arr[]={2,0,0,1,2,1,0,2,1,0,2,2};
        sort012(arr,arr.length);
    }
}
