public class AllPairs {
    static int allPairs(int arr[], int target){
        int count=0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target)
                {count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=7;
        System.out.println(allPairs(arr, target));
    }
}
