public class BinarySearch {
    static int binarySearch(int arr[], int x, int n){
        int low=0; int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                high--;
            //	high=mid-1;
            }
              else{
             low++;
            	  //     low=mid+1;
              }  
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50, 60}; 
        int n = 6;
		int x = 60;
        System.out.println(binarySearch(arr, x, n));
    }
}
