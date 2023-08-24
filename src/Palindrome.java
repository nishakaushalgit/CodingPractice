public class Palindrome {
    static boolean isPalindrome(String str){
        int n= str.length();
        int begin=0;
        int end=n-1;
        while(begin<end){
            if(str.charAt(begin)!=str.charAt(end)){
                return false;
            }
            
            begin++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str= "AMANMA";
        System.out.println(isPalindrome(str));
    }
}
