public class ReverseWordsPreservingSpaces {
    static void reverseWordsPreservingSpaces(String str){
        char arr[]= str.toCharArray();
        int n= arr.length;
        int start=0;
        int end=n-1;
 //       for(start=0;start<end;start++) {
       while(start<end){
//            if(arr[start] == ' '){
//                start++;
//                continue;
//            }
//            else if (arr[end]==' '){
//                end--;
//                continue;
//            }
//            else{
                char temp= arr[start];
                arr[start]= arr[end];
                arr[end]= temp;
                start++;
                end--;
//            }
        }
        String reverse=String.valueOf(arr);
        System.out.println(reverse);
        }
    public static void main(String[] args) {
        String str= "I love you";
        reverseWordsPreservingSpaces(str);
    }
}
