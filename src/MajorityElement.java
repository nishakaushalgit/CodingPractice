import java.util.*;
public class MajorityElement {
    static void findMajority(int arr[]){
        HashMap <Integer, Integer> map=new HashMap<>();
        boolean flag=false;
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i])+1;
                if(count>arr.length/2){
                    flag = true;
                    System.out.println("Majority element is "+ arr[i]);
                }
                else
                { map.put(arr[i], count);} 
            }
            else
            map.put(arr[i],1);  
         } 
         if(flag==false){
            System.out.println("No majority element");
         }
    }
    //     int max_count=0;
    //     int index=-1;
    //     for(int i=0;i<arr.length;i++){
    //         int count=0;
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count>max_count){
    //             max_count=count;
    //             index=i;
    //         }
    //     }
    //     if(max_count>(arr.length/2)){
    //         System.out.println("Majority element is "+ arr[index]);
    //     }
    //     else
    //     System.out.println("No majority element");

    // }
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 1, 3, 5, 1};
        findMajority(arr);
    }
}
