public class ReverseAllWords {
    static void reverseAllWords(String str){
        char arr[]= str.toCharArray();
        int n=arr.length;
        int start=0;
        for(int end=0; end<n;end++){
            if(arr[end]==' '){
                reverse(arr, start, end-1);
               start= end+1;
            }   
        }
        reverse(arr, start, n-1);
        String reversed=String.valueOf(arr); 
        System.out.println(reversed); 
    }
    static void reverse(char arr[], int low, int high){
       char temp;
        while(low<high){
            temp= arr[low];
            arr[low]=arr[high];
            arr[high]= temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        String str="Welcome to gfd";
    reverseAllWords(str);
    }
}
