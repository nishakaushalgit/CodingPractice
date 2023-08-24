import java.util.*;

public class TwoSumProblem {
    static ArrayList<Integer> twoSumArray(int arr[], int target){
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        ArrayList<Integer> al = new ArrayList<>();
        //int result[]= new int[2];
         for(int i=0; i<arr.length;i++){
            int  complement= target-arr[i];
            if(map.containsKey(complement)){
                al.add(i);
                al.add(map.get(complement));
            }
            map.put(arr[i],i);
        }
        return al;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=6;
        System.out.print(twoSumArray(arr, target));
    }
}
