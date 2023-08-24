import java.util.HashMap;

public class LongestSubarrayWithSumK {
    static int maxLength(int arr[], int n, int k){
        HashMap<Integer, Integer> map= new HashMap<>();
        //int maxlength=0;
        int sum=0; int count=0;
        for(int i=0;i<n;i++){
            sum= sum+arr[i];
            if(sum==k){
                //maxlength=i+1;
                count++;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                //if(maxlength<map.get(sum-k)){
                //maxlength=Math.max(maxlength, i-map.get(sum-k));
                count++;
            //}
            }
        }
        //return maxlength;
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,6,-1,1,7};
        int k=7;int n=5;
        System.out.println(maxLength(arr, n, k));
    }
}
