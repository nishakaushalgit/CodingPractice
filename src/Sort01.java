public class Sort01 {
    static void segregate0and1(int arr[], int n) {
      int low = 0;
      int high = n - 1;
      int temp;
      while (low < high) {
        if (arr[low] == 1) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
          high--;
        } else {
          low++;
        }
      }
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,0}; int n=6;
        segregate0and1(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}