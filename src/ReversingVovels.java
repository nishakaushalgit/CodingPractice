public class ReversingVovels {
    static boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }
    static void reversingVovels(String str){
        char arr[]=str.toCharArray();
        int n= arr.length;
        int start=0;
        int end=n-1;
        while(start<end){
            if(!isVowel(arr[start])){
                start++;
                continue;
            }
            else if(!isVowel(arr[end])){
                end--;
                continue;
            }
            else{
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        String str1= String.valueOf(arr);
        System.out.println(str1);
    }
    public static void main(String[] args) {
        String str="My nAme is Nisha";
        reversingVovels(str);
    }
}
